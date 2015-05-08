using LL.EAAddin.IntegrationArchitect.Plugin.Uml2EmfExporter.Properties;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Windows.Forms;

namespace LL.EAAddin.IntegrationArchitect.Plugin.Uml2EmfExporter
{
	public partial class Loading : Form
	{
		private Actions lastaction = Actions.None;
		public event EventHandler Closing = delegate { };

		public Loading()
		{
			InitializeComponent();
		}


		internal void Disconnected()
		{
			this.Invoke((Action)(() =>
				{
					this.Hide();
					lastaction = Actions.None;
					UpdateInfo("finished");
				}));
		}

		/// <summary>
		/// Updates the info.
		/// </summary>
		/// <param name="text">The text.</param>
		internal void UpdateInfo(string text)
		{
			this.Invoke((Action)(() => { labInfo.Text = text; }));

		}

		/// <summary>
		/// Updates the info.
		/// </summary>
		/// <param name="action">The action.</param>
		/// <param name="text">The text.</param>
		internal void UpdateInfo(Actions action, string text)
		{

			this.Invoke((Action)(() =>
				{
					if (!lastaction.Equals(action))
					{
						switch (action)
						{
							case Actions.XMIExport:
								pictureBox1.Image = Resources.exportxmi;
								break;
							case Actions.Connecting:
								pictureBox1.Image = Resources.connecting;
								break;
							case Actions.DataTransfer:
								pictureBox1.Image = Resources.documentpulse;
								break;
							default:
								pictureBox1.Image = Resources.loading;
								break;
						}
						lastaction = action;
					}
					labInfo.Text = text;
				}));


		}

		private void button1_Click(object sender, EventArgs e)
		{
			this.Hide();
			this.Closing(this, EventArgs.Empty);
		}

		private void Loading_FormClosing(object sender, FormClosingEventArgs e)
		{
			e.Cancel = true;
			this.Hide();
		}
	}
}
