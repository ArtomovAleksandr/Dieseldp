$(function () {
    $("#save").click(
        function (e) {
            let name=$("#category").val();
            var category=new Category(name);
            function success() {
                console.log("done!");
                location.replace("/category")
            }
            function fail() {
                console.log("error!")
                location.replace("/category")
            }
            let servise=new AJAXService();
            servise.post("/api/v1.0/category",category,success,fail);
            e.preventDefault();

        }
    );
});