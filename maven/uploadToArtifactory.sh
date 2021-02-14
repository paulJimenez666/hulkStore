#!/bin/bash

SOURCE="$1"
DEST="$2"
USER="bot-notas-contables"
PASS="AKCp5ekSwrGWGqSfo5srFb3Fz68QjG7uPt1yXaGbcx18415SVPegGQebVuuJTxpWzDnGhYYhp"

#export http_proxy=<proxy_http:port>
#export https_proxy=<proxy_http:port>

find ${SOURCE} -type f | egrep -v '(md5|sha1)$' | while read f
do
        PATH_DST=$(echo ${f} | sed -e "s,^${SOURCE},,")
        echo "${f} -> ${DEST}${PATH_DST}"
        curl -k -u "$USER:$PASS" -X PUT ${DEST}${PATH_DST} -T ${f}
done

find ${SOURCE} -type f | egrep '(md5|sha1)$' | while read f
do
        PATH_DST=$(echo ${f} | sed -e "s,^${SOURCE},,")
        echo "${f} -> ${DEST}${PATH_DST}"
        curl -k -u "$USER:$PASS" -X PUT ${DEST}${PATH_DST} -T ${f}
done

