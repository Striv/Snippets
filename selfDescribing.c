#include <stdio.h>
int isSelfDescribing(char* line);

int main( int argc, const char* argv[] ) 
{
    char* line;
    FILE * f;
    f = fopen(argv[1], "r");
    {
    while (fgets(line, 1024, f)) {

            // Skip empty lines
            if (line[0] == '\n') {
                continue;
            }
            printf("%s\n", line);
            //printf("%d\n", isSelfDescribing(line));
        }

        
    }
    return 0; 
}

int isSelfDescribing(char* line)
{
    // Scan through each digit in number
    for (int i = 0; i < sizeof(line)/sizeof(line[0]); i++)
    {
        // Start counter at zero
        int counter = 0;
        // Get digit value at i
        int digitValue = line[i] - '0';
        // Scan through string again to count how many i's there are in it --> store in counter
        for(int j = 0; j < sizeof(line)/sizeof(line[0]); j++)
        {
            int newDigit = digitValue = line[j] - '0';
            if(newDigit == digitValue)
                counter++;
        }
        // If counter doesn't equal the digit value, break away immediately
        if(counter != digitValue)
            return 0;
    }
    // If you went through the whole thing and haven't returned false, return true
    return 1;
}