#include <stdio.h>

void main()
{
    int a[10], key, low, high, mid, i, n, found=0;

    printf("Enter the number of elements\n");
    scanf("%d",&n);

    printf("Enter the elements in ascending order\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }

    printf("Enter the key to search\n");
    scanf("%d",&key);

    low = 0;
    high = n-1;

    while(low<=high && !found)
    {
        mid = (low + high)/2;

        if(a[mid]==key)
        {
            found = 1;
        }

        else if(key<a[mid])
        {
            high = mid - 1;
        }

        else 
        {
            low = mid + 1;
        }
    }

    if(found==0)
    {
        printf("Element not found\n");
    }

    else 
    {
        printf("Element found at location : %d\n",mid+1);
    }
}

// 1, 2, 3, 4, 5
