time=1;
while (($time<1000))
	sleep 0.1h
	do
	DATE=$(date +%Y%m%d%H%M)
	echo "$DATE" > /sdcard/zxy/time
	sleep 2
	sh /sdcard/zxy/demo3.sh
	wait
	sleep 2
	DATE=$(date +%Y%m%d%H%M)
	echo "$DATE" > /sdcard/zxy/time
	time=$(($time+1));
done
