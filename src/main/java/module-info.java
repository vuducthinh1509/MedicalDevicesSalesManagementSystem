module com.example.medicaldevicessalesmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;


    opens controller to javafx.fxml;
    exports controller;

    opens view to javafx.fxml;
    exports view;

    opens test to javafx.fxml;
    exports test;

    opens entity to javafx.fxml;
    exports entity;

    opens controller.NhanVien to javafx.fxml;
    exports controller.NhanVien;

    opens controller.BaoHanh to javafx.fxml;
    exports controller.BaoHanh;

    opens controller.KhoHang to javafx.fxml;
    exports controller.KhoHang;

    opens controller.KhoHang.XuatHang to javafx.fxml;
    exports controller.KhoHang.XuatHang;

    opens controller.KhachHang to javafx.fxml;
    exports controller.KhachHang;

    opens controller.ExportInvoice to javafx.fxml;
    exports  controller.ExportInvoice;


}