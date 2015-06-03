/*
 * revert.c
 *
 *  Created on: Jun 3, 2015
 *      Author: Halo9Pan
 *  实现一个revert函数，它的功能是将输入的字符串在原串上倒序后返回。
 */

#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include <stdint.h>

#include "random.c"

void
revert_string(int length, char *string)
{
  for (int i = 0; i < (length / 2); ++i) {
	char temp = string[i];
	string[i] = string[length - i - 1];
	string[length - i - 1] = temp;
  }
}

int
main (void)
{
  printf ("!!!Hello %s!!!\n", "World"); /* prints !!!Hello World!!! */
  int length = 15;
  char string[length];
  random_chars(length, string);
  printf("%s\n", string);
  revert_string(length, string);
  printf("%s\n", string);
  return EXIT_SUCCESS;
}

