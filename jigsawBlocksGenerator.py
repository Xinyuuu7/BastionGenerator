import os
import nbtlib

directory = 'jigsaws'
filenames = []

for root, dirs, files in os.walk(directory):
    for fname in files:
        filenames.append(os.path.join(root, fname))


def gen_jigsaws():
    for filename in filenames:
        nbt_file = nbtlib.load(filename)
        blocks = nbt_file['blocks']
        text = 'this.put(\"' + filename[:-4].replace('\\', '/') + '\", Arrays.asList(\n'
        jigsaw_count = 0

        first = True
        for block in blocks:
            blockstateid = int(block['state'])
            blockinfo = nbt_file['palette'][blockstateid]
            name = blockinfo['Name']
            if name != 'minecraft:jigsaw':
                continue
            jigsaw_count += 1

            orientation = blockinfo['Properties']['orientation']
            orient_1, orient_2 = orientation.split('_')
            poolname = block['nbt']['pool']
            # processing poolname
            poolname = poolname.upper().replace('\\', '_').replace('/', '_')

            jigsawname = block['nbt']['name']
            targetname = block['nbt']['target']
            joint = block['nbt']['joint']

            if not first:
                text += ',\n'
            first = False

            text += f'\t\tnew JigsawBlock(PoolType.{poolname[10:]}, JointType.{joint.upper()}, '
            text += f'\"{jigsawname[10:]}\", \"{targetname[10:]}\", '
            text += f'BlockDirection.{orient_1.upper()}, BlockDirection.{orient_2.upper()}, '

            blockpos = block['pos']
            bpos = 'new BPos('
            c = 0
            for integer in blockpos:
                c += 1
                value = str(integer)[4:-1]
                bpos += value
                if c != 3:
                    bpos += ','
            bpos += '))'

            text += bpos

        text += '\n));'
        print(text)


gen_jigsaws()