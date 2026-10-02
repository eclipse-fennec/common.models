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
import gov.nist.csrc.ns.oscal.Import;
import gov.nist.csrc.ns.oscal.Merge;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.Modify;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Profile;

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
 * An implementation of the model object '<em><b>Profile</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl#getMetadata <em>Metadata</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl#getImport <em>Import</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl#getMerge <em>Merge</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl#getModify <em>Modify</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl#getBackMatter <em>Back Matter</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.ProfileImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProfileImpl extends MinimalEObjectImpl.Container implements Profile {
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
	 * The cached value of the '{@link #getImport() <em>Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> import_;

	/**
	 * The cached value of the '{@link #getMerge() <em>Merge</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerge()
	 * @generated
	 * @ordered
	 */
	protected Merge merge;

	/**
	 * The cached value of the '{@link #getModify() <em>Modify</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModify()
	 * @generated
	 * @ordered
	 */
	protected Modify modify;

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
	protected ProfileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getProfile();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__METADATA, oldMetadata, newMetadata);
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
				msgs = ((InternalEObject)metadata).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__METADATA, null, msgs);
			if (newMetadata != null)
				msgs = ((InternalEObject)newMetadata).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__METADATA, null, msgs);
			msgs = basicSetMetadata(newMetadata, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__METADATA, newMetadata, newMetadata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getImport() {
		if (import_ == null) {
			import_ = new EObjectContainmentEList<Import>(Import.class, this, OSCALPackage.PROFILE__IMPORT);
		}
		return import_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Merge getMerge() {
		return merge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMerge(Merge newMerge, NotificationChain msgs) {
		Merge oldMerge = merge;
		merge = newMerge;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__MERGE, oldMerge, newMerge);
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
	public void setMerge(Merge newMerge) {
		if (newMerge != merge) {
			NotificationChain msgs = null;
			if (merge != null)
				msgs = ((InternalEObject)merge).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__MERGE, null, msgs);
			if (newMerge != null)
				msgs = ((InternalEObject)newMerge).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__MERGE, null, msgs);
			msgs = basicSetMerge(newMerge, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__MERGE, newMerge, newMerge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Modify getModify() {
		return modify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModify(Modify newModify, NotificationChain msgs) {
		Modify oldModify = modify;
		modify = newModify;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__MODIFY, oldModify, newModify);
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
	public void setModify(Modify newModify) {
		if (newModify != modify) {
			NotificationChain msgs = null;
			if (modify != null)
				msgs = ((InternalEObject)modify).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__MODIFY, null, msgs);
			if (newModify != null)
				msgs = ((InternalEObject)newModify).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__MODIFY, null, msgs);
			msgs = basicSetModify(newModify, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__MODIFY, newModify, newModify));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__BACK_MATTER, oldBackMatter, newBackMatter);
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
				msgs = ((InternalEObject)backMatter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__BACK_MATTER, null, msgs);
			if (newBackMatter != null)
				msgs = ((InternalEObject)newBackMatter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.PROFILE__BACK_MATTER, null, msgs);
			msgs = basicSetBackMatter(newBackMatter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__BACK_MATTER, newBackMatter, newBackMatter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.PROFILE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.PROFILE__METADATA:
				return basicSetMetadata(null, msgs);
			case OSCALPackage.PROFILE__IMPORT:
				return ((InternalEList<?>)getImport()).basicRemove(otherEnd, msgs);
			case OSCALPackage.PROFILE__MERGE:
				return basicSetMerge(null, msgs);
			case OSCALPackage.PROFILE__MODIFY:
				return basicSetModify(null, msgs);
			case OSCALPackage.PROFILE__BACK_MATTER:
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
			case OSCALPackage.PROFILE__METADATA:
				return getMetadata();
			case OSCALPackage.PROFILE__IMPORT:
				return getImport();
			case OSCALPackage.PROFILE__MERGE:
				return getMerge();
			case OSCALPackage.PROFILE__MODIFY:
				return getModify();
			case OSCALPackage.PROFILE__BACK_MATTER:
				return getBackMatter();
			case OSCALPackage.PROFILE__UUID:
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
			case OSCALPackage.PROFILE__METADATA:
				setMetadata((Metadata)newValue);
				return;
			case OSCALPackage.PROFILE__IMPORT:
				getImport().clear();
				getImport().addAll((Collection<? extends Import>)newValue);
				return;
			case OSCALPackage.PROFILE__MERGE:
				setMerge((Merge)newValue);
				return;
			case OSCALPackage.PROFILE__MODIFY:
				setModify((Modify)newValue);
				return;
			case OSCALPackage.PROFILE__BACK_MATTER:
				setBackMatter((BackMatter)newValue);
				return;
			case OSCALPackage.PROFILE__UUID:
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
			case OSCALPackage.PROFILE__METADATA:
				setMetadata((Metadata)null);
				return;
			case OSCALPackage.PROFILE__IMPORT:
				getImport().clear();
				return;
			case OSCALPackage.PROFILE__MERGE:
				setMerge((Merge)null);
				return;
			case OSCALPackage.PROFILE__MODIFY:
				setModify((Modify)null);
				return;
			case OSCALPackage.PROFILE__BACK_MATTER:
				setBackMatter((BackMatter)null);
				return;
			case OSCALPackage.PROFILE__UUID:
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
			case OSCALPackage.PROFILE__METADATA:
				return metadata != null;
			case OSCALPackage.PROFILE__IMPORT:
				return import_ != null && !import_.isEmpty();
			case OSCALPackage.PROFILE__MERGE:
				return merge != null;
			case OSCALPackage.PROFILE__MODIFY:
				return modify != null;
			case OSCALPackage.PROFILE__BACK_MATTER:
				return backMatter != null;
			case OSCALPackage.PROFILE__UUID:
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

} //ProfileImpl
