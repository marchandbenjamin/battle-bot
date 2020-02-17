package main;

import com.ineat.academy.work.poox.bo.Action;
import com.ineat.academy.work.poox.bo.BoardElement;
import com.ineat.academy.work.poox.bo.BoardPosition;
import com.ineat.academy.work.poox.bo.PlayerBehaviour;

import java.util.List;
import java.util.Map;

public class BattleBot implements PlayerBehaviour {

    public String getPlayerName() {
        return "Bob";
    }

    public List<Action> getPlayerActions(Map<BoardPosition, BoardElement> currentBoard, BoardPosition playerPosition, int nbAuthorizedActions) {
        return null;
    }

    public BoardPosition getEnemyPosition(Map<BoardPosition, BoardElement> currentBoard, BoardPosition playerPosition){
        for ( Map.Entry<BoardPosition, BoardElement> boardCell : currentBoard.entrySet() ) {
            if (!boardCell.getValue().isFree() && !boardCell.getValue().equals(playerPosition)) {
                return boardCell.getKey();
            }
        }
        return playerPosition;
    }
}
