/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package mil.jpeojtrs.sca.partitioning.provider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import mil.jpeojtrs.sca.partitioning.PartitioningPackage;
import mil.jpeojtrs.sca.partitioning.util.PartitioningAdapterFactory;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ChildCreationExtenderManager;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.Disposable;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IChildCreationExtender;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PartitioningItemProviderAdapterFactory extends PartitioningAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable, IChildCreationExtender {

	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;
	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();
	/**
	 * This keeps track of all the item providers created, so that they can be {@link #dispose disposed}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Disposable disposable = new Disposable();
	/**
	 * This helps manage the child creation extenders.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChildCreationExtenderManager childCreationExtenderManager = new ChildCreationExtenderManager(PartitioningEditPlugin.INSTANCE, PartitioningPackage.eNS_URI);
	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartitioningItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.DomComponentFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomComponentFileItemProvider domComponentFileItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.DomComponentFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomComponentFileAdapter() {
		if (domComponentFileItemProvider == null) {
			domComponentFileItemProvider = new DomComponentFileItemProvider(this);
		}

		return domComponentFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.DevComponentFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DevComponentFileItemProvider devComponentFileItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.DevComponentFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDevComponentFileAdapter() {
		if (devComponentFileItemProvider == null) {
			devComponentFileItemProvider = new DevComponentFileItemProvider(this);
		}

		return devComponentFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.ComponentFileRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFileRefItemProvider componentFileRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentFileRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentFileRefAdapter() {
		if (componentFileRefItemProvider == null) {
			componentFileRefItemProvider = new ComponentFileRefItemProvider(this);
		}

		return componentFileRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.ComponentFiles} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentFilesItemProvider componentFilesItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentFiles}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentFilesAdapter() {
		if (componentFilesItemProvider == null) {
			componentFilesItemProvider = new ComponentFilesItemProvider(this);
		}

		return componentFilesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentInstantiationItemProvider componentInstantiationItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentInstantiation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentInstantiationAdapter() {
		if (componentInstantiationItemProvider == null) {
			componentInstantiationItemProvider = new ComponentInstantiationItemProvider(this);
		}

		return componentInstantiationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.ComponentProperties} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentPropertiesItemProvider componentPropertiesItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentProperties}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentPropertiesAdapter() {
		if (componentPropertiesItemProvider == null) {
			componentPropertiesItemProvider = new ComponentPropertiesItemProvider(this);
		}

		return componentPropertiesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSupportedInterfaceItemProvider componentSupportedInterfaceItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentSupportedInterfaceAdapter() {
		if (componentSupportedInterfaceItemProvider == null) {
			componentSupportedInterfaceItemProvider = new ComponentSupportedInterfaceItemProvider(this);
		}

		return componentSupportedInterfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentSupportedInterfaceStubItemProvider componentSupportedInterfaceStubItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ComponentSupportedInterfaceStub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createComponentSupportedInterfaceStubAdapter() {
		if (componentSupportedInterfaceStubItemProvider == null) {
			componentSupportedInterfaceStubItemProvider = new ComponentSupportedInterfaceStubItemProvider(this);
		}

		return componentSupportedInterfaceStubItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceThatLoadedThisComponentRefItemProvider deviceThatLoadedThisComponentRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.DeviceThatLoadedThisComponentRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceThatLoadedThisComponentRefAdapter() {
		if (deviceThatLoadedThisComponentRefItemProvider == null) {
			deviceThatLoadedThisComponentRefItemProvider = new DeviceThatLoadedThisComponentRefItemProvider(this);
		}

		return deviceThatLoadedThisComponentRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceUsedByThisComponentRefItemProvider deviceUsedByThisComponentRefItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.DeviceUsedByThisComponentRef}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceUsedByThisComponentRefAdapter() {
		if (deviceUsedByThisComponentRefItemProvider == null) {
			deviceUsedByThisComponentRefItemProvider = new DeviceUsedByThisComponentRefItemProvider(this);
		}

		return deviceUsedByThisComponentRefItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.DomainFinder} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainFinderItemProvider domainFinderItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.DomainFinder}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDomainFinderAdapter() {
		if (domainFinderItemProvider == null) {
			domainFinderItemProvider = new DomainFinderItemProvider(this);
		}

		return domainFinderItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.FindBy} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindByItemProvider findByItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.FindBy}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindByAdapter() {
		if (findByItemProvider == null) {
			findByItemProvider = new FindByItemProvider(this);
		}

		return findByItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.FindByStub} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindByStubItemProvider findByStubItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.FindByStub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindByStubAdapter() {
		if (findByStubItemProvider == null) {
			findByStubItemProvider = new FindByStubItemProvider(this);
		}

		return findByStubItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.FindByStubContainer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindByStubContainerItemProvider findByStubContainerItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.FindByStubContainer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFindByStubContainerAdapter() {
		if (findByStubContainerItemProvider == null) {
			findByStubContainerItemProvider = new FindByStubContainerItemProvider(this);
		}

		return findByStubContainerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.LocalFile} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalFileItemProvider localFileItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.LocalFile}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocalFileAdapter() {
		if (localFileItemProvider == null) {
			localFileItemProvider = new LocalFileItemProvider(this);
		}

		return localFileItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link mil.jpeojtrs.sca.partitioning.NamingService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingServiceItemProvider namingServiceItemProvider;

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.NamingService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createNamingServiceAdapter() {
		if (namingServiceItemProvider == null) {
			namingServiceItemProvider = new NamingServiceItemProvider(this);
		}

		return namingServiceItemProvider;
	}

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.ProvidesPortStub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidesPortStubAdapter() {
		return new ProvidesPortStubItemProvider(this);
	}

	/**
	 * This creates an adapter for a {@link mil.jpeojtrs.sca.partitioning.UsesPortStub}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createUsesPortStubAdapter() {
		return new UsesPortStubItemProvider(this);
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * Associates an adapter with a notifier via the base implementation, then records it to ensure it will be disposed.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void associate(Adapter adapter, Notifier target) {
		super.associate(adapter, target);
		if (adapter != null) {
			disposable.add(adapter);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<IChildCreationExtender> getChildCreationExtenders() {
		return childCreationExtenderManager.getChildCreationExtenders();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Collection<?> getNewChildDescriptors(Object object, EditingDomain editingDomain) {
		return childCreationExtenderManager.getNewChildDescriptors(object, editingDomain);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLocator getResourceLocator() {
		return childCreationExtenderManager;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		disposable.dispose();
	}

}
