###ImageMagick Installation:

https://www.imagemagick.org/script/download.php#macosx

###Generic command for batch trim:

find ./ -name "*.png" -exec convert {} -trim outputfolder/{} \;
###Command to trim and overwrite files:

find ./ -name "*.png" -exec convert {} -trim ./{} \;

###Generic command for batch scale (by 50%):

find ./ -name "*.png" -exec convert {} -scale 50% outputfolder/{} \;

###Command to scale (by 50%) and overwrite files:

find ./ -name "*.png" -exec convert {} -scale 50% ./{} \;

###Command to trim and scale (by 30%) and overwrite files:

find ./ -name "*.png" -exec convert {} -trim -scale 30% ./{} \;


###Command to trim and scale (by 25%) with 30 pixel borders and overwrite files:

find ./ -name "*.png" -exec convert {} -trim -scale 25% ./{} \;

find ./ -name "*.png" -exec convert {} -trim -scale 25% -border 30x30 -background white -alpha remove ./{} \;


find ./ -name "*.png" -exec convert {} -background white -alpha remove ./{} \;

find ./ -name "*.png" -exec convert {} -trim -scale 40% -border 30x30 -bordercolor white -background white -alpha remove ./{} \;

#####Source of commands:

https://askubuntu.com/questions/351767/how-to-crop-borders-white-spaces-from-image#351772

find ./ -name "shallowCopyDeepCopy*.png" -exec convert {} -scale 70% ./{} \;