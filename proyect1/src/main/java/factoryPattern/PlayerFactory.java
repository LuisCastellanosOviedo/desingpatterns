package factoryPattern;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PlayerFactory {


    private static PlayerFactory playerFactory;

    private PlayerFactory(){
    }


    public static synchronized PlayerFactory getInstance(){
        if(playerFactory==null){
            playerFactory= new PlayerFactory();
        }
        return playerFactory;
    }


    final static Map<String, Supplier<Player>> players = new HashMap<>();
    static {
        players.put("fordward", FordwardPlayer::new);
        players.put("goalkeeper",GoalKeeperPlayer::new);
    }


    public Player getPlayer(String type){
        Supplier<Player> player= players.get(type.toLowerCase());
        if(player!=null){
            return player.get();
        }
        throw new IllegalArgumentException("No existe player " + type.toUpperCase());
    }
}
