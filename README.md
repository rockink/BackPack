# BackPack
BackPack is the datastructure that is based on last in, first out, but maintaining the chrological order. 


I created this when I was using one of the APIs that gave me data in the decreasing order of date. I also had reciever setup for the broadcast and it would send me the most updated data. So, I had a case that the data are stored in decreasing order of date, and new data recieved are of newer date. So, I created this, created a pointer of new data, and send the interated value from that pointer. So, a call to this datastructure would give user the data sorted based on that criteria. 

Here is how I use.


    AnyObject[] initialHolderOfArrays = getAnyObjectFromThisMethod(); //your implmenetation of method that returns AnyObject[]
    BackPack<AnyObject> backPack = new BackPack<>(initialHolderOfArrays, 0); //initiate the backPack and set pointer at 0
    
  
  
To get the data from the BackPack, we just do.


    AnyObject[] faces = backPack.getContent(AnyObject.class);


Note: In place of AnyObject, you can use any Class you want to use. I used it for custom datastructure. It works!!
