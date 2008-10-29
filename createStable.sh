#!/bin/bash


echo "....................."
echo "";
echo "Creating jar in directory stable ... ";


#
# Create Manifest
#
kk=`cat .classpath | sed "s/<classpathentry.* kind=\"lib\" path=\"//g"` 
kk=`echo -e $kk | sed "s/<?xml.*CONTAINER//g"`
kk=`echo -e $kk | sed "s/<classpathentr.*th>//g"`
kk=`echo -e $kk | sed "s/\"\/>/ \r /g"`
kk="Manifest-Version: 1.0\rMain-Class: com.jcraft.weirdx.WeirdX\rClass-Path: lib/log4j-1.2.15.jar $kk\r" 
echo -e $kk | sed "s/\r/\r\n/g" > META-INF/MANIFEST.MF

echo "File MANIFEST.MF created sucessfully."




cd build
jar cmf ../META-INF/MANIFEST.MF ../stable/xhttp.jar *
