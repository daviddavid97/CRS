/system/bin/screencap -p /sdcard/zxy/screenshot.png
wait
app_process -Djava.class.path=/sdcard/zxy/getcolor.dex /sdcard/zxy/ getcolor
wait
var=$(cat /sdcard/zxy/hello.txt) 
wait
input tap $var 
