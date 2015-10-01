# BackPack
BackPack is last in, first out. 


I had to create this because I was using another API, which would give data sorted by date, which meant that least date was on the last. I had to maintain the list, while not repeating reading the data again and again. Therefore, I created this, so that the data stored in the last would get replaced my new data, and the data read starts from that pointer.

Here is how I use.


    Object[] initialHolderOfArrays = getAnyObjectFromThisMethod();
    BackPack<ContentFace> backPack = new BackPack<>(indHolder, 0);
  
  
To get the data from the BackPack, we just do.


    Object[] faces = backPack.getContent(Object.class);


Note: In place of Object, you can use any Class you want to use. I used it for custom datastructure. It works!!
