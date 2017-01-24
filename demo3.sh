a=1;
while (($a<10))
do
sh disable.sh
wait
input tap 664 765
input tap 581 503
var=$(cat /sdcard/zxy/ac/1)
wait
input text $var
sleep 0.5
input text $a 
sleep 0.5
input keyevent 66
wait
input text zxy51984zxy
sh enable.sh
sleep 10
input keyevent 66
sleep 20
input tap 643 457
# free chest
i=1;
while(($i<15))
do
	i=$i+1;
	sleep 0.5
	input tap 207 272 
done
wait
# chests
# donate
sleep 2
input tap 535 1214
input tap 586 806
input tap 586 530
input tap 586 254
input tap 586 806
input tap 586 530
input tap 586 254
sleep 1
input tap 120 1109
sleep 1
wait
/system/bin/screencap -p /sdcard/zxy/screenshot.png
wait
app_process -Djava.class.path=/sdcard/zxy/getcolor.dex /sdcard/zxy/ getcolor
wait
var=$(cat /sdcard/zxy/hello.txt) 
wait
input tap $var
# buy cards
wait
input tap 89 1217
input tap 140 650
input tap 511 750
input tap 511 750
input tap 647 413
input tap 350 640
input tap 511 750
input tap 511 750

a=$(($a+1));
input keyevent 3
am force-stop com.supercell.clashroyale.kunlun
done









