const somethingWillHappen = () => {
    return new Promise((resolve, reject) =>{
        if (false){
            resolve('Hey!');
        } else{
            reject('Whoooops!');
        }
    });
};

somethingWillHappen()
    .then(response => console.log(response))
    .catch(err => console.error(err))


    const somethingWillHappen2 = () => new Promise((resolve, reject) => true ? setTimeout(() => resolve('True'), 5000) : reject(error)
    );
    
    somethingWillHappen2()
      .then( response => console.log(response))
      .catch( err => console.log(err));


    // const somethingWillHappen2 = () => {
    //     return new Promise((resolve, reject) => {
    //         if(true){
    //             setTimeout(() => {
    //                 resolve('True');
    //             }, 2000)
    //         } else {
    //             const error = new Error('Whoooooops!');
    //             reject(error);
    //         }
    //     });
    // }
    
    // somethingWillHappen2()
    //     -then(response => console.log(response))
    //     .catch(err => console.log(err));