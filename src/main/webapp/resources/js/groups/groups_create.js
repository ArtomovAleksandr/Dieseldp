$(function () {
    $("#save").click(
        function (e) {
            let name=$('#groups').val();
            var groups=new Groups(name);
            function success() {
                console.log("done!");
                location.replace("/groups/show/1");
            }
            function fail() {
                console.log("error!")
                location.replace("/groups/show/1");
            }
            let servise=new AJAXService();
            servise.post("/api/v1.0/groups",groups,success,fail);
            e.preventDefault();

        }
    )

});