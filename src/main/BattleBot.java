package main;

import com.ineat.academy.work.poox.bo.Action;
import com.ineat.academy.work.poox.bo.BoardElement;
import com.ineat.academy.work.poox.bo.BoardPosition;
import com.ineat.academy.work.poox.bo.PlayerBehaviour;

import java.util.List;

public class BattleBot implements PlayerBehaviour {

    public String getPlayerName() {
        return null;
    }

    public List<Action> getPlayerActions(java.util.Map<BoardPosition, BoardElement> currentBoard, BoardPosition playerPosition, int nbAuthorizedActions) {
        return null;
    }
}
