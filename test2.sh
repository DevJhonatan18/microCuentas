#!/bin/bash
#echo $1
#echo $2

curl -X GET "$1:$2/ver/$3" | python -m json.tool
