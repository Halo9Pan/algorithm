/*
 * revert.c
 *
 *  Created on: Jun 3, 2015
 *      Author: Halo9Pan
 *
 * 根据上排给出十个数，在其下排填出对应的十个数
 * 要求下排每个数都是先前上排那十个数在下排出现的次数。
 * 上排的十个数如下：
 * 【0，1，2，3，4，5，6，7，8，9】
 * 举一个例子，
 * 数值: 0,1,2,3,4,5,6,7,8,9
 * 分配: 6,2,1,0,0,0,1,0,0,0
 * 0在下排出现了6次，1在下排出现了2次，
 * 2在下排出现了1次，3在下排出现了0次....
 * 以此类推..
 */

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <stdint.h>
#include <stdbool.h>

#include "random.c"

const short NUMBER = 10;

void
next_row (int length, int *ss)
{
  int count;
  int i, j;

  int a[NUMBER];
  for (int k = 0; k < NUMBER; k++)
	a[k] = k;

  int count_times[NUMBER];
  for (int k = 0; k < NUMBER; k++)
	{
	  count_times[k] = 0;
	}
  bool success = false, result = true;

  while (!success)
	{
	  result = true;
	  for (i = 0; i < NUMBER; i++)
		{
		  count = 0;
		  for (j = 0; j < NUMBER; j++)
			{
			  if (count_times[j] == a[i])
				count++;
			}

		  if (count_times[i] != count)
			{
			  count_times[i] = count;
			  result = false;
			}
		}
	  success = result;
	}

  for (j = 0; j < NUMBER; j++)
	printf ("%d ", count_times[j]);

}

int
main (void)
{
  int length = 10;
  int ss[length];
  next_row (length, ss);
  return EXIT_SUCCESS;
}

