$(function f() {
    var namestorage = 'basketstorge';
    var fulltimestorage=2880;//минуты 2880
    checkFullTime(namestorage,fulltimestorage);
    readStorageForBasketShow(namestorage);
});