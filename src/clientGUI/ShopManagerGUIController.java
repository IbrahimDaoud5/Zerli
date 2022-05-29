package clientGUI;


import client.ClientController;
import client.NewWindowFrameController;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class ShopManagerGUIController {
    @FXML
    private ImageView manageCustomersBtn;

    @FXML
    private ImageView approveCustomersBtn;

    @FXML
    private ImageView managePermissionsBtn;
    @FXML
    private Label lblManager;

    @FXML
    private ImageView logOutBtn;

    @FXML
    private ImageView viewReportsBtn;

    @FXML
    private ImageView viewCancellationRequestBtn;

    @FXML
    private ImageView viewOrdersBtn;

    public ClientController cc =ClientController.getClientController();

    @FXML
    public void initialize() {
        lblManager.setText("Hello " + ClientController.userLoginData.getUsername());
    }

    @FXML
    void ClickedLogoutBtn(MouseEvent event) {
        Stage stage = (Stage)lblManager.getScene().getWindow();
        cc.logout(stage);

    }
    @FXML
    void clickedViewCancellationRequestBtn(MouseEvent event) throws Exception{
        NewWindowFrameController customerWindow = new NewWindowFrameController("ReviewCancellationGUI");
        customerWindow.start(new Stage());
        Stage stage = (Stage) lblManager.getScene().getWindow();
        stage.hide();
    }

    @FXML
    void clickedViewOrdersBtn(MouseEvent event) throws Exception {
        NewWindowFrameController customerWindow = new NewWindowFrameController("ReviewOrdersGUI");
        customerWindow.start(new Stage());
        Stage stage = (Stage) lblManager.getScene().getWindow();
        stage.hide();

    }

    @FXML
    void clickedViewReportsBtn(MouseEvent event) throws Exception {
        NewWindowFrameController customerWindow = new NewWindowFrameController("ViewReportsGUI");
        customerWindow.start(new Stage());
        Stage stage = (Stage) lblManager.getScene().getWindow();
        stage.hide();
    }
    @FXML
    void clickedManageCustomersBtn(MouseEvent event) throws Exception {
        NewWindowFrameController customerWindow = new NewWindowFrameController("ManageCustomersGUI");
        customerWindow.start(new Stage());
        Stage stage = (Stage) lblManager.getScene().getWindow();
        stage.hide();
    }

    @FXML
    void clickedApproveCustomersBtn(MouseEvent event) throws Exception {
        NewWindowFrameController customerWindow = new NewWindowFrameController("ApproveCustomersGUI");
        customerWindow.start(new Stage());
        Stage stage = (Stage) lblManager.getScene().getWindow();
        stage.hide();
    }
    @FXML
    void clickedManagePermissionsBtn(MouseEvent event) throws Exception {
        NewWindowFrameController customerWindow = new NewWindowFrameController("ManagePermissionsGUI");
        customerWindow.start(new Stage());
        Stage stage = (Stage) lblManager.getScene().getWindow();
        stage.hide();
    }

    @FXML
    void enteredLogoutBtn(MouseEvent event) {
        cc.enteredButton(logOutBtn);
    }

    @FXML
    void enteredViewCancelationRequestBtn(MouseEvent event) {
        cc.enteredButton(viewCancellationRequestBtn);
    }

    @FXML
    void enteredViewOrdersBtn(MouseEvent event) {
        cc.enteredButton(viewOrdersBtn);
    }

    @FXML
    void enteredViewReportsBtn(MouseEvent event) {
        cc.enteredButton(viewReportsBtn);
    }

    @FXML
    void leavedLogoutBtn(MouseEvent event) {
        cc.leavedButton(logOutBtn);
    }

    @FXML
    void leavedViewCancelationRequestBtn(MouseEvent event) {
        cc.leavedButton(viewCancellationRequestBtn);
    }

    @FXML
    void leavedViewOrdersBtn(MouseEvent event) {
        cc.leavedButton(viewOrdersBtn);
    }

    @FXML
    void leavedViewReportsBtn(MouseEvent event) {
        cc.leavedButton(viewReportsBtn);
    }

    @FXML
    void enteredApproveCustomersBtn(MouseEvent event) {cc.enteredButton(approveCustomersBtn);}
    @FXML
    void enteredManagePermissionsBtn(MouseEvent event) {cc.enteredButton(managePermissionsBtn);}
    @FXML
    void enteredManageCustomersBtn(MouseEvent event) {cc.enteredButton(manageCustomersBtn);}
    @FXML
    void leavedManageCustomersBtn(MouseEvent event) {cc.leavedButton(manageCustomersBtn);}

    @FXML
    void leavedApproveCustomersBtn(MouseEvent event) {cc.leavedButton(approveCustomersBtn);}
    @FXML
    void leavedManagePermissionsBtn(MouseEvent event) {cc.leavedButton(managePermissionsBtn);}

}