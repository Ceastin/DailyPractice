#!/bin/bash
#https://leetcode.com/problems/longest-subsequence-with-non-zero-bitwise-xor/?envType=daily-question&envId=2026-08-15
nums=("$@")
tot=0
c=0
for i in "${nums[@]}"; do
	tot=$((tot ^ i))
	if [ "$i" -ne 0 ]; then
		c=$((c + 1))
	fi
done
if [ "$tot" -ne 0 ]; then
	echo "${#nums[@]}"
elif [ "$c" -ne 0 ]; then
	echo "$((${#nums[@]}-1))"
else
	echo "0"
fi
