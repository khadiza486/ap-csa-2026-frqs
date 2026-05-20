public Account( String requestedName){
    int num =1;
    if(requestedName.isAvailable()){
        username = requestedName;
    } 
    while(!requestedName.isAvailable()){
        username = requestedName+num;
        num++;
    }
}
