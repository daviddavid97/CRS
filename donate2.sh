b=1;
while (($b<10))
do
	sh disable.sh
	wait
	input tap 664 765
	input tap 581 503
	var=$(cat /sdcard/zxy/ac/1)
	wait
	input text $var
	sleep 0.5
	input text $b 
	sleep 0.5
	input keyevent 66
	wait
	input text zxy51984zxy
	sh enable.sh
	sleep 10
	input keyevent 66
	sleep 20
	input tap 643 457	
	input tap 207 272
	input tap 207 272
	sleep 2
	input tap 535 1214
	input tap 586 806
	input tap 586 530
	input tap 586 254
	input tap 586 806
	input tap 586 530
	input tap 586 254
	input tap 586 806
	input tap 586 530
	input tap 586 254
	input tap 586 806
	input tap 586 530
	input tap 586 254
b=$(($b+1));
input keyevent 3
am force-stop com.supercell.clashroyale.kunlun
done
