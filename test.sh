#!/bin/bash
echo $1
echo $2

curl -X GET "$1:$2/listar" | python -m json.tool
