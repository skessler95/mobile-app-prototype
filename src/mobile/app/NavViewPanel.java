/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mobile.app;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Steven
 */
public class NavViewPanel extends JPanel{
    private NavViewBottomMenuPanel menu;
    private ViewSplash splash;
    
    private HomeView h_view;
    private OffersView o_view;
    private StoresView st_view;
    private PostView p_view;
    private SettingsView s_view;
    
    public NavViewPanel(){
        super();
        setLayout(new BorderLayout());
        menu = new NavViewBottomMenuPanel();
        splash = new ViewSplash();
        
        add(menu, BorderLayout.SOUTH);
        add(splash, BorderLayout.CENTER);
    }
    
    public void addHome(HomeView h_view)
    {
        this.h_view = h_view;
        add(h_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addOffers(OffersView o_view)
    {
        this.o_view = o_view;
        add(o_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addStores(StoresView st_view)
    {
        this.st_view = st_view;
        add(st_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addPost(PostView p_view)
    {
        this.p_view = p_view;
        add(p_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addSettings(SettingsView s_view)
    {
        this.s_view = s_view;
        add(s_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void addSplash(View n_view)
    {
        add(n_view, BorderLayout.CENTER);
        revalidate();
        repaint();
    }
    
    public void removeHome()
    {
        if(this.h_view != null)
            remove(this.h_view);
    }
    
    public void removeOffers()
    {
        if(this.o_view != null)
            remove(this.o_view);
    }
    
    public void removeStores()
    {
        if(this.st_view != null)
            remove(this.st_view);
    }
    
    public void removePost()
    {
        if(this.p_view != null)
            remove(this.p_view);
    }
    
    public void removeSettings()
    {
        if(this.s_view != null)
            remove(this.s_view);
    }
    
    public void removeSplash()
    {
        remove(splash);
    }
   
    public NavViewBottomMenuPanel getMenu() {
        return menu;
    }
    
    public void setMenu(NavViewBottomMenuPanel menu) {
        this.menu = menu;
    }
    
}
