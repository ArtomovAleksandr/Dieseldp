function ishaveStorahe(namestorage) {
    if (localStorage.getItem(namestorage) !== null) {
        return true;
    }
    return false;
}
function readStorage(namestorage) {
    if (ishaveStorahe(namestorage)) {
        return JSON.parse(localStorage.getItem(namestorage));
    }
    return false;
}
function removeStorage(namestorage){
    if(ishaveStorahe(namestorage)){
        localStorage.removeItem(namestorage);
        return true;
    }
    return false;
}