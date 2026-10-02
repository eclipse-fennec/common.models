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

import gov.nist.csrc.ns.oscal.BackMatter;
import gov.nist.csrc.ns.oscal.Catalog;
import gov.nist.csrc.ns.oscal.CatalogGroup;
import gov.nist.csrc.ns.oscal.Control;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Parameter;

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
 * An implementation of the model object '<em><b>Catalog</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl#getParam <em>Param</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl#getControl <em>Control</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.CatalogImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CatalogImpl extends MinimalEObjectImpl.Container implements Catalog {
	/**
	 * The cached value of the '{@link #getMetadata() <em>Metadata</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadata()
	 * @generated
	 * @ordered
	 */
	protected Metadata metadata;

	/**
	 * The cached value of the '{@link #getParam() <em>Param</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParam()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> param;

	/**
	 * The cached value of the '{@link #getControl() <em>Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getControl()
	 * @generated
	 * @ordered
	 */
	protected EList<Control> control;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected EList<CatalogGroup> group;

	/**
	 * The cached value of the '{@link #getBackMatter() <em>Back Matter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackMatter()
	 * @generated
	 * @ordered
	 */
	protected BackMatter backMatter;

	/**
	 * The default value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUuid() <em>Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUuid()
	 * @generated
	 * @ordered
	 */
	protected String uuid = UUID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CatalogImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getCatalog();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metadata getMetadata() {
		return metadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadata(Metadata newMetadata, NotificationChain msgs) {
		Metadata oldMetadata = metadata;
		metadata = newMetadata;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG__METADATA, oldMetadata, newMetadata);
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
	public void setMetadata(Metadata newMetadata) {
		if (newMetadata != metadata) {
			NotificationChain msgs = null;
			if (metadata != null)
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CATALOG__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CATALOG__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Parameter> getParam() {
		if (param == null) {
			param = new EObjectContainmentEList<Parameter>(Parameter.class, this, OSCALPackage.CATALOG__PARAM);
		}
		return param;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Control> getControl() {
		if (control == null) {
			control = new EObjectContainmentEList<Control>(Control.class, this, OSCALPackage.CATALOG__CONTROL);
		}
		return control;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CatalogGroup> getGroup() {
		if (group == null) {
			group = new EObjectContainmentEList<CatalogGroup>(CatalogGroup.class, this, OSCALPackage.CATALOG__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BackMatter getBackMatter() {
		return backMatter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBackMatter(BackMatter newBackMatter, NotificationChain msgs) {
		BackMatter oldBackMatter = backMatter;
		backMatter = newBackMatter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG__BACK_MATTER, oldBackMatter, newBackMatter);
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
	public void setBackMatter(BackMatter newBackMatter) {
		if (newBackMatter != backMatter) {
			NotificationChain msgs = null;
			if (backMatter != null)
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CATALOG__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.CATALOG__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG__BACK_MATTER, newBackMatter, newBackMatter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUuid() {
		return uuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUuid(String newUuid) {
		String oldUuid = uuid;
		uuid = newUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.CATALOG__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.CATALOG__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.CATALOG__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG__CONTROL:
				return ((InternalEList<?>)getControl()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case OSCALPackage.CATALOG__BACK_MATTER:
				return basicSetBackMatter(null, msgs);
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
			case OSCALPackage.CATALOG__METADATA:
				return getMetadata();
			case OSCALPackage.CATALOG__PARAM:
				return getParam();
			case OSCALPackage.CATALOG__CONTROL:
				return getControl();
			case OSCALPackage.CATALOG__GROUP:
				return getGroup();
			case OSCALPackage.CATALOG__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.CATALOG__UUID:
				return getUuid();
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
			case OSCALPackage.CATALOG__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.CATALOG__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OSCALPackage.CATALOG__CONTROL:
				getControl().clear();
				getControl().addAll((Collection<? extends Control>)newValue);
				return;
			case OSCALPackage.CATALOG__GROUP:
				getGroup().clear();
				getGroup().addAll((Collection<? extends CatalogGroup>)newValue);
				return;
			case OSCALPackage.CATALOG__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.CATALOG__UUID:
				setUuid((String)newValue);
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
			case OSCALPackage.CATALOG__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.CATALOG__PARAM:
				getParam().clear();
				return;
			case OSCALPackage.CATALOG__CONTROL:
				getControl().clear();
				return;
			case OSCALPackage.CATALOG__GROUP:
				getGroup().clear();
				return;
			case OSCALPackage.CATALOG__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.CATALOG__UUID:
				setUuid(UUID_EDEFAULT);
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
			case OSCALPackage.CATALOG__METADATA:
				return metadata != null;
			case OSCALPackage.CATALOG__PARAM:
				return param != null && !param.isEmpty();
			case OSCALPackage.CATALOG__CONTROL:
				return control != null && !control.isEmpty();
			case OSCALPackage.CATALOG__GROUP:
				return group != null && !group.isEmpty();
			case OSCALPackage.CATALOG__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.CATALOG__UUID:
				return UUID_EDEFAULT == null ? uuid != null : !UUID_EDEFAULT.equals(uuid);
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
		result.append(" (uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //CatalogImpl
