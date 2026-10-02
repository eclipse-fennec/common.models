/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package gov.nist.csrc.ns.oscal.impl;

import gov.nist.csrc.ns.oscal.InventoryItem;
import gov.nist.csrc.ns.oscal.LeveragedAuthorization;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.SystemComponent;
import gov.nist.csrc.ns.oscal.SystemImplementation;
import gov.nist.csrc.ns.oscal.SystemUser;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getLeveragedAuthorization <em>Leveraged Authorization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getUser <em>User</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getInventoryItem <em>Inventory Item</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.SystemImplementationImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemImplementationImpl extends MinimalEObjectImpl.Container implements SystemImplementation {
	/**
	 * The cached value of the '{@link #getProp() <em>Prop</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProp()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> prop;

	/**
	 * The cached value of the '{@link #getLink() <em>Link</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLink()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> link;

	/**
	 * The cached value of the '{@link #getLeveragedAuthorization() <em>Leveraged Authorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeveragedAuthorization()
	 * @generated
	 * @ordered
	 */
	protected EList<LeveragedAuthorization> leveragedAuthorization;

	/**
	 * The cached value of the '{@link #getUser() <em>User</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUser()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemUser> user;

	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<SystemComponent> component;

	/**
	 * The cached value of the '{@link #getInventoryItem() <em>Inventory Item</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInventoryItem()
	 * @generated
	 * @ordered
	 */
	protected EList<InventoryItem> inventoryItem;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype remarks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getSystemImplementation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.SYSTEM_IMPLEMENTATION__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Link> getLink() {
		if (link == null) {
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.SYSTEM_IMPLEMENTATION__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<LeveragedAuthorization> getLeveragedAuthorization() {
		if (leveragedAuthorization == null) {
			leveragedAuthorization = new EObjectContainmentEList<LeveragedAuthorization>(LeveragedAuthorization.class, this, OSCALPackage.SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION);
		}
		return leveragedAuthorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemUser> getUser() {
		if (user == null) {
			user = new EObjectContainmentEList<SystemUser>(SystemUser.class, this, OSCALPackage.SYSTEM_IMPLEMENTATION__USER);
		}
		return user;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SystemComponent> getComponent() {
		if (component == null) {
			component = new EObjectContainmentEList<SystemComponent>(SystemComponent.class, this, OSCALPackage.SYSTEM_IMPLEMENTATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<InventoryItem> getInventoryItem() {
		if (inventoryItem == null) {
			inventoryItem = new EObjectContainmentEList<InventoryItem>(InventoryItem.class, this, OSCALPackage.SYSTEM_IMPLEMENTATION__INVENTORY_ITEM);
		}
		return inventoryItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemarks(MarkupMultilineDatatype newRemarks, NotificationChain msgs) {
		MarkupMultilineDatatype oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS, oldRemarks, newRemarks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(MarkupMultilineDatatype newRemarks) {
		if (newRemarks != remarks) {
			NotificationChain msgs = null;
			if (remarks != null)
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_IMPLEMENTATION__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION:
				return ((InternalEList<?>)getLeveragedAuthorization()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_IMPLEMENTATION__USER:
				return ((InternalEList<?>)getUser()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_IMPLEMENTATION__COMPONENT:
				return ((InternalEList<?>)getComponent()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_IMPLEMENTATION__INVENTORY_ITEM:
				return ((InternalEList<?>)getInventoryItem()).basicRemove(otherEnd, msgs);
			case OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS:
				return basicSetRemarks(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_IMPLEMENTATION__PROP:
				return getProp();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LINK:
				return getLink();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION:
				return getLeveragedAuthorization();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__USER:
				return getUser();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__COMPONENT:
				return getComponent();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__INVENTORY_ITEM:
				return getInventoryItem();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS:
				return getRemarks();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_IMPLEMENTATION__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION:
				getLeveragedAuthorization().clear();
				getLeveragedAuthorization().addAll((Collection<? extends LeveragedAuthorization>)newValue);
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__USER:
				getUser().clear();
				getUser().addAll((Collection<? extends SystemUser>)newValue);
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__COMPONENT:
				getComponent().clear();
				getComponent().addAll((Collection<? extends SystemComponent>)newValue);
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__INVENTORY_ITEM:
				getInventoryItem().clear();
				getInventoryItem().addAll((Collection<? extends InventoryItem>)newValue);
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_IMPLEMENTATION__PROP:
				getProp().clear();
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LINK:
				getLink().clear();
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION:
				getLeveragedAuthorization().clear();
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__USER:
				getUser().clear();
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__COMPONENT:
				getComponent().clear();
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__INVENTORY_ITEM:
				getInventoryItem().clear();
				return;
			case OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OSCALPackage.SYSTEM_IMPLEMENTATION__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__LEVERAGED_AUTHORIZATION:
				return leveragedAuthorization != null && !leveragedAuthorization.isEmpty();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__USER:
				return user != null && !user.isEmpty();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__COMPONENT:
				return component != null && !component.isEmpty();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__INVENTORY_ITEM:
				return inventoryItem != null && !inventoryItem.isEmpty();
			case OSCALPackage.SYSTEM_IMPLEMENTATION__REMARKS:
				return remarks != null;
		}
		return super.eIsSet(featureID);
	}

} //SystemImplementationImpl
