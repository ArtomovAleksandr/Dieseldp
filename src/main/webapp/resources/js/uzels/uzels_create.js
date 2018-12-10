$(function () {
    $("#save").click(
        function (e) {
            let name=$('#uzels').val();
            var uzels=new Uzel(name,1);
            function success() {
                console.log("done!");
                location.replace("/uzels/show/1");
            }
            function fail() {
                console.log("error!")
                location.replace("/uzels/show/1");
            }
            let servise=new AJAXService();
            servise.post("/api/v1.0/uzels",uzels,success,fail);
            e.preventDefault();

        }
    )

});