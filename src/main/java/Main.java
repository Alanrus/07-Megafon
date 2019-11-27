import ru.itpark.model.InternetTariff;
import ru.itpark.model.OtherTariff;
import ru.itpark.model.TurnOnTariff;

public class Main {
    public static void main(String[] args) {
        InternetTariff internetTariffFirst = new InternetTariff(1,
                "Твой безлимит на 6 месяцев",
                true,
                3100,
                false,
                "Трафик без ограничений для использования дома и в поездках по России",
                0);

        OtherTariff otherTariffFirst = new OtherTariff(2,
                "Переходи на НОЛЬ",
                false,
                0,
                false,
                "Тариф без абонентской платы для выгодных звонков"
        );
        TurnOnTariff turnOnTariff = new TurnOnTariff(3,
                "Включайся! Смотри",
                true,
                0,
                false,
                "",
                1200,
                0,
                300,
                false,
                false,
                false,
                true,
                30);


    }
}
