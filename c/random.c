/*
 * random.c
 *
 *  Created on: Jun 3, 2015
 *      Author: Halo9Pan
 */

#include <stdlib.h>
#include <string.h>
#include <math.h>
#include <time.h>

const char CHAR_a = 'a';
const char CHAR_z = 'z';
const short CHAR_LENGHT = 26;

void
random_chars(int length, char *cs)
{
  srand(time(NULL));
  for (int i = 0; i < length; ++i) {
	cs[i] = CHAR_a + (rand() % CHAR_LENGHT);
  }
  return;
}
