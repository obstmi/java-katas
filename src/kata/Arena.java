public class Arena {

	public static String fight(Worm worm1, Worm worm2) {

		// TODO

		// Which worm starts?
		while (worm1.getLife() > 0 && worm2.getLife() > 0) {
			if (worm1.getLife() <= worm2.getLife()) {
				int restOfLife = worm2.getLife() - worm1.getAttack();
				worm2.setLife(restOfLife);
				if (worm2.getLife() <= 0) {
					return worm1.getName();
				}
			} else {
				int restOfLife = worm1.getLife() - worm2.getAttack();
				worm1.setLife(restOfLife);
				if (worm1.getLife() <= 0) {
					return worm2.getName();
				}
			}
		}

		return null;
	}
}
