package awt;

import doom.DoomMain;
import java.awt.Canvas;

/**
 * A simple Doom display & keyboard driver for AWT. Uses a Canvas for painting and implements some of the IVideo
 * methods.
 *
 * Uses 8-bit buffered images and switchable IndexColorModels.
 *
 * It's really basic, but allows testing and user interaction. Heavily based on the original LinuxDoom X11
 * implementation, and is similar in goals: just a functional, reference implementation to build upon whatever fancy
 * extensions you like.
 *
 * The only "hitch" is that this implementation expects to be initialized upon a BufferedRenderer with multiple images
 * per screen buffer in order to perform the palette switching trick.
 *
 * The images themselves don't have to be "BufferedImage", and in theory it could be possible to use e.g.
 * MemoryImageSource for the same purpose . Oh well.
 *
 *
 *
 * @author Velktron
 *
 */
class AWTDoom<V> extends DoomFrame<V> {
    
    /**
     * Gimme some raw palette RGB data. I will do the rest
     *
     * (hint: read this from the PLAYPAL lump in the IWAD!!!).
     */
    AWTDoom(DoomMain<?, V> DM) {
        super(DM);
    }

    @Override
    protected Canvas createCanvas() {
        return this.drawhere = new Canvas();
    }

    @Override
    public void SetGamma(int level) {
        if (D) {
            System.err.println("Setting gamma " + level);
        }
        DOOM.graphicSystem.setUsegamma(level);
    }

    @Override
    public void FinishUpdate() {
        this.update(null);
    }
}

//$Log: AWTDoom.java,v $
//Revision 1.16  2012/11/06 16:04:34  velktron
//Spiffy new fullscreen switching system.
//
//Revision 1.15  2012/09/24 17:16:23  velktron
//Massive merge between HiColor and HEAD. There's no difference from now on, and development continues on HEAD.
//
//Revision 1.14.2.5  2012/09/24 16:58:06  velktron
//TrueColor, Generics.
//
//Revision 1.14.2.4  2012/09/20 14:06:58  velktron
//Generic AWTDoom
//
//Revision 1.14.2.3  2012/09/17 15:57:07  velktron
//Moved common code to DoomFrame
//
//Revision 1.14.2.2  2011/11/18 21:38:30  velktron
//Uses 16-bit stuff.
//
//Revision 1.14.2.1  2011/11/14 00:27:11  velktron
//A barely functional HiColor branch. Most stuff broken. DO NOT USE
//
//Revision 1.14  2011/11/01 19:03:10  velktron
//Using screen number constants
//
//Revision 1.13  2011/10/23 18:11:07  velktron
//Split functionality into DoomFrame, gerenic compliance.
//
//Revision 1.12  2011/10/11 13:24:51  velktron
//Major overhaul to work with new renderer interface. Now only available windowing system.
//
//Revision 1.11  2011/08/01 00:59:57  velktron
//Shut up debug messages.
//
//Revision 1.10  2011/07/15 13:57:54  velktron
//Implement VI.ReadScreen as a future good practice.
//
//Revision 1.9  2011/06/23 15:42:38  velktron
//Added modular palette rotation to handle sub-14 cases.
//
//Revision 1.8  2011/06/14 09:54:20  velktron
//Separated palette generation/fixed OldAWTDoom
//
//Revision 1.7  2011/06/08 17:24:59  velktron
//Added support for gamma changes.
//
//Revision 1.6  2011/06/02 14:54:18  velktron
//Old AWTEvents deprecated. MochaEvents now default.
//
//Revision 1.3  2011/06/01 17:42:49  velktron
//Removed stupid nagging.
//
//Revision 1.2  2011/06/01 17:17:24  velktron
//New event system.
//
//Revision 1.1  2011/06/01 17:04:23  velktron
//New event system.
//
//Revision 1.4  2011/05/30 02:25:50  velktron
//Centering and offsetting on expose, proper exiting.
//
//Revision 1.3  2011/05/29 22:15:32  velktron
//Introduced IRandom interface.
//
//Revision 1.2  2011/05/29 20:58:58  velktron
//Added better mouse grabbing method, more reliable, more cross-OS.
//
//Revision 1.1  2011/05/27 13:26:56  velktron
//A slightly better, though not perfect, way to handle input, partially based on_D_'s work.
//
