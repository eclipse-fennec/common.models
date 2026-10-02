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

import gov.nist.csrc.ns.oscal.ControlSelectControlById;
import gov.nist.csrc.ns.oscal.IncludeAll;
import gov.nist.csrc.ns.oscal.InsertControls;
import gov.nist.csrc.ns.oscal.OSCALPackage;

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
 * An implementation of the model object '<em><b>Insert Controls</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InsertControlsImpl#getIncludeAll <em>Include All</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InsertControlsImpl#getIncludeControls <em>Include Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InsertControlsImpl#getExcludeControls <em>Exclude Controls</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InsertControlsImpl#getOrder <em>Order</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InsertControlsImpl extends MinimalEObjectImpl.Container implements InsertControls {
	/**
	 * The cached value of the '{@link #getIncludeAll() <em>Include All</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAll()
	 * @generated
	 * @ordered
	 */
	protected IncludeAll includeAll;

	/**
	 * The cached value of the '{@link #getIncludeControls() <em>Include Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeControls()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSelectControlById> includeControls;

	/**
	 * The cached value of the '{@link #getExcludeControls() <em>Exclude Controls</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeControls()
	 * @generated
	 * @ordered
	 */
	protected EList<ControlSelectControlById> excludeControls;

	/**
	 * The default value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected String order = ORDER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsertControlsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getInsertControls();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IncludeAll getIncludeAll() {
		return includeAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncludeAll(IncludeAll newIncludeAll, NotificationChain msgs) {
		IncludeAll oldIncludeAll = includeAll;
		includeAll = newIncludeAll;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL, oldIncludeAll, newIncludeAll);
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
	public void setIncludeAll(IncludeAll newIncludeAll) {
		if (newIncludeAll != includeAll) {
			NotificationChain msgs = null;
			if (includeAll != null)
				msgs = ((InternalEObject)includeAll).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL, null, msgs);
			if (newIncludeAll != null)
				msgs = ((InternalEObject)newIncludeAll).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL, null, msgs);
			msgs = basicSetIncludeAll(newIncludeAll, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL, newIncludeAll, newIncludeAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlSelectControlById> getIncludeControls() {
		if (includeControls == null) {
			includeControls = new EObjectContainmentEList<ControlSelectControlById>(ControlSelectControlById.class, this, OSCALPackage.INSERT_CONTROLS__INCLUDE_CONTROLS);
		}
		return includeControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ControlSelectControlById> getExcludeControls() {
		if (excludeControls == null) {
			excludeControls = new EObjectContainmentEList<ControlSelectControlById>(ControlSelectControlById.class, this, OSCALPackage.INSERT_CONTROLS__EXCLUDE_CONTROLS);
		}
		return excludeControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrder(String newOrder) {
		String oldOrder = order;
		order = newOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INSERT_CONTROLS__ORDER, oldOrder, order));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL:
				return basicSetIncludeAll(null, msgs);
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_CONTROLS:
				return ((InternalEList<?>)getIncludeControls()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INSERT_CONTROLS__EXCLUDE_CONTROLS:
				return ((InternalEList<?>)getExcludeControls()).basicRemove(otherEnd, msgs);
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
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL:
				return getIncludeAll();
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_CONTROLS:
				return getIncludeControls();
			case OSCALPackage.INSERT_CONTROLS__EXCLUDE_CONTROLS:
				return getExcludeControls();
			case OSCALPackage.INSERT_CONTROLS__ORDER:
				return getOrder();
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
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL:
				setIncludeAll((IncludeAll)newValue);
				return;
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_CONTROLS:
				getIncludeControls().clear();
				getIncludeControls().addAll((Collection<? extends ControlSelectControlById>)newValue);
				return;
			case OSCALPackage.INSERT_CONTROLS__EXCLUDE_CONTROLS:
				getExcludeControls().clear();
				getExcludeControls().addAll((Collection<? extends ControlSelectControlById>)newValue);
				return;
			case OSCALPackage.INSERT_CONTROLS__ORDER:
				setOrder((String)newValue);
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
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL:
				setIncludeAll((IncludeAll)null);
				return;
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_CONTROLS:
				getIncludeControls().clear();
				return;
			case OSCALPackage.INSERT_CONTROLS__EXCLUDE_CONTROLS:
				getExcludeControls().clear();
				return;
			case OSCALPackage.INSERT_CONTROLS__ORDER:
				setOrder(ORDER_EDEFAULT);
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
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_ALL:
				return includeAll != null;
			case OSCALPackage.INSERT_CONTROLS__INCLUDE_CONTROLS:
				return includeControls != null && !includeControls.isEmpty();
			case OSCALPackage.INSERT_CONTROLS__EXCLUDE_CONTROLS:
				return excludeControls != null && !excludeControls.isEmpty();
			case OSCALPackage.INSERT_CONTROLS__ORDER:
				return ORDER_EDEFAULT == null ? order != null : !ORDER_EDEFAULT.equals(order);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (order: ");
		result.append(order);
		result.append(')');
		return result.toString();
	}

} //InsertControlsImpl
