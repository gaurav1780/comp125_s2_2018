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

#####Source of commands:

https://askubuntu.com/questions/351767/how-to-crop-borders-white-spaces-from-image#351772