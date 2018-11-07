$(function () {
    $("#save").click(
        function (e) {
            let name=$("#category").val();
            var category=new Category(name,1);
            function success() {
                console.log("done!");
                location.replace("/category/show/1")
            }
            function fail() {
                console.log("error!")
                location.replace("/category/show/1")
            }
            let servise=new AJAXService();
            servise.post("/api/v1.0/category",category,success,fail);
            e.preventDefault();

        }
    );
});