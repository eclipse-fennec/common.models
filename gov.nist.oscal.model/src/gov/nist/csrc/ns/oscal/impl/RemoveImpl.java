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

import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Remove;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl#getByClass <em>By Class</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl#getById <em>By Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl#getByItemName <em>By Item Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl#getByName <em>By Name</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.RemoveImpl#getByNs <em>By Ns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveImpl extends MinimalEObjectImpl.Container implements Remove {
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
	 * The default value of the '{@link #getByClass() <em>By Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByClass()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByClass() <em>By Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByClass()
	 * @generated
	 * @ordered
	 */
	protected String byClass = BY_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getById() <em>By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getById()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getById() <em>By Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getById()
	 * @generated
	 * @ordered
	 */
	protected String byId = BY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getByItemName() <em>By Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByItemName()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_ITEM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByItemName() <em>By Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByItemName()
	 * @generated
	 * @ordered
	 */
	protected String byItemName = BY_ITEM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getByName() <em>By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByName()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByName() <em>By Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByName()
	 * @generated
	 * @ordered
	 */
	protected String byName = BY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getByNs() <em>By Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByNs()
	 * @generated
	 * @ordered
	 */
	protected static final String BY_NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByNs() <em>By Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByNs()
	 * @generated
	 * @ordered
	 */
	protected String byNs = BY_NS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getRemove();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.REMOVE__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.REMOVE__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByClass() {
		return byClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByClass(String newByClass) {
		String oldByClass = byClass;
		byClass = newByClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__BY_CLASS, oldByClass, byClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getById() {
		return byId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setById(String newById) {
		String oldById = byId;
		byId = newById;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__BY_ID, oldById, byId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByItemName() {
		return byItemName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByItemName(String newByItemName) {
		String oldByItemName = byItemName;
		byItemName = newByItemName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__BY_ITEM_NAME, oldByItemName, byItemName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByName() {
		return byName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByName(String newByName) {
		String oldByName = byName;
		byName = newByName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__BY_NAME, oldByName, byName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getByNs() {
		return byNs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setByNs(String newByNs) {
		String oldByNs = byNs;
		byNs = newByNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.REMOVE__BY_NS, oldByNs, byNs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.REMOVE__REMARKS:
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
			case OSCALPackage.REMOVE__REMARKS:
				return getRemarks();
			case OSCALPackage.REMOVE__BY_CLASS:
				return getByClass();
			case OSCALPackage.REMOVE__BY_ID:
				return getById();
			case OSCALPackage.REMOVE__BY_ITEM_NAME:
				return getByItemName();
			case OSCALPackage.REMOVE__BY_NAME:
				return getByName();
			case OSCALPackage.REMOVE__BY_NS:
				return getByNs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OSCALPackage.REMOVE__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.REMOVE__BY_CLASS:
				setByClass((String)newValue);
				return;
			case OSCALPackage.REMOVE__BY_ID:
				setById((String)newValue);
				return;
			case OSCALPackage.REMOVE__BY_ITEM_NAME:
				setByItemName((String)newValue);
				return;
			case OSCALPackage.REMOVE__BY_NAME:
				setByName((String)newValue);
				return;
			case OSCALPackage.REMOVE__BY_NS:
				setByNs((String)newValue);
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
			case OSCALPackage.REMOVE__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.REMOVE__BY_CLASS:
				setByClass(BY_CLASS_EDEFAULT);
				return;
			case OSCALPackage.REMOVE__BY_ID:
				setById(BY_ID_EDEFAULT);
				return;
			case OSCALPackage.REMOVE__BY_ITEM_NAME:
				setByItemName(BY_ITEM_NAME_EDEFAULT);
				return;
			case OSCALPackage.REMOVE__BY_NAME:
				setByName(BY_NAME_EDEFAULT);
				return;
			case OSCALPackage.REMOVE__BY_NS:
				setByNs(BY_NS_EDEFAULT);
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
			case OSCALPackage.REMOVE__REMARKS:
				return remarks != null;
			case OSCALPackage.REMOVE__BY_CLASS:
				return BY_CLASS_EDEFAULT == null ? byClass != null : !BY_CLASS_EDEFAULT.equals(byClass);
			case OSCALPackage.REMOVE__BY_ID:
				return BY_ID_EDEFAULT == null ? byId != null : !BY_ID_EDEFAULT.equals(byId);
			case OSCALPackage.REMOVE__BY_ITEM_NAME:
				return BY_ITEM_NAME_EDEFAULT == null ? byItemName != null : !BY_ITEM_NAME_EDEFAULT.equals(byItemName);
			case OSCALPackage.REMOVE__BY_NAME:
				return BY_NAME_EDEFAULT == null ? byName != null : !BY_NAME_EDEFAULT.equals(byName);
			case OSCALPackage.REMOVE__BY_NS:
				return BY_NS_EDEFAULT == null ? byNs != null : !BY_NS_EDEFAULT.equals(byNs);
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
		result.append(" (byClass: ");
		result.append(byClass);
		result.append(", byId: ");
		result.append(byId);
		result.append(", byItemName: ");
		result.append(byItemName);
		result.append(", byName: ");
		result.append(byName);
		result.append(", byNs: ");
		result.append(byNs);
		result.append(')');
		return result.toString();
	}

} //RemoveImpl
