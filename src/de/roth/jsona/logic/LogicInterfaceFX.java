package de.roth.jsona.logic;

import java.util.List;

import de.roth.jsona.model.MusicListItem;

public interface LogicInterfaceFX {

	public void start();
	public void close();

	public void event_playlist_changed(String atomicId, List<MusicListItem> items);
	public void event_playlist_namechanged(String atomicId, String oldname, String newname);
	public void event_playlist_new();
	public void event_playlist_remove(String atomicId);

	public void event_ui_exit();
	public void event_ui_hide();

	public void event_player_next(MusicListItem item, MusicListItem nextItem);
	public void event_player_previous(MusicListItem item, MusicListItem prevItem);

	public void event_player_play_skipto(double value);
	public void event_player_volume(int newValue, int oldValue);
	public void event_player_play_pause();

	public void event_playbackmode_normal();
	public void event_playbackmode_shuffle();
	
	public void event_play_url(String url);

	public void event_search_music(String query);

}
