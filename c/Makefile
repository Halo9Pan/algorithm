
RM := rm -f
CC := gcc

USER_OBJS :=

LIBS :=

OBJ_SRCS := 
ASM_SRCS := 
C_SRCS := 
S_UPPER_SRCS := 
O_SRCS := 
EXECUTABLES := 
OBJS := 
C_DEPS := 

# Every subdirectory with source files must be described here
SUBDIRS := \
src \

ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
endif

-include ../makefile.defs

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../revert.c \
../ten_numbers.c 

OBJS += \
./revert.o \
./ten_numbers.o 

C_DEPS += \
./revert.d \
./ten_numbers.d 

EXECUTABLES += \
./revert.exe

# All Target
all: $(OBJS)

# Tool invocations
algorithm_c: $(OBJS) $(USER_OBJS)
	@echo 'Building target: $@'
	@echo 'Invoking: MinGW C Linker'
	$(CC) -o "algorithm_c" $(OBJS) $(USER_OBJS) $(LIBS)
	@echo 'Finished building target: $@'
	@echo ' '

# Each subdirectory must supply rules for building sources it contributes
%.o: ../%.c
	@echo 'Building file: $<'
	@echo 'Invoking: GCC C Compiler'
	$(CC) -std=c99 -O2 -g -Wall -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d)" -o "$@" "$<"
	@echo 'Invoking: MinGW C Linker'
	$(CC) -o "$(@:.o=.exe)" "$@" $(USER_OBJS) $(LIBS)
	@echo 'Finished building: $<'
	@echo ' '


# Other Targets
clean:
	-$(RM) $(EXECUTABLES)$(OBJS)$(C_DEPS) algorithm_c
	-@echo ' '

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets
