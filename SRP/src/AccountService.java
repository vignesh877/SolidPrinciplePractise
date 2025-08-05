public class AccountService {
    private AccountRepository accountRepository;
    private NofiticationService nofiticationService;

    AccountService(){
        accountRepository = new AccountRepository();
        nofiticationService = new NofiticationService();
    }
    public void openAccount(){
        System.out.println("Fill account details");
        accountRepository.create();
        nofiticationService.sendNotification();

    }
}


