#!/bin/bash
OIFS=$IFS #save original
IFS=','
output=($(ps -ex | awk '/[A]pplications/ {print $1" "$4,$5","}'))
IFS=$OIFS
n=${#output[@]}
for (( i=0; i<n; i++ ));
do
    app=$(echo ${output[$i]} | awk 'match($0,"/Applications/"){print RSTART}')
    app=$(echo $((app+13)))
    name=$(echo ${output[$i]:$app} | awk 'match($0,".app") {print RSTART}')
    echo "Do you want to close: " ${output[$i]:app:name} "?"
    read -e decide
    if(( decide == "y" )) || (( decide == "Y")); then
        space=$(echo ${output[$i]} | awk 'match($0," ") {print RSTART}')
        echo "Killing process: " ${output[$i]:0:space}
        kill -9 ${output[$i]:0:space}
    else
        echo "NOT CLOSED."
    fi
done 