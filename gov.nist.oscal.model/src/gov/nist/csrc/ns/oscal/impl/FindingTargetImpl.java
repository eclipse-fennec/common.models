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

import gov.nist.csrc.ns.oscal.FindingTarget;
import gov.nist.csrc.ns.oscal.FindingTargetStatus;
import gov.nist.csrc.ns.oscal.ImplementationStatus;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;

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
 * An implementation of the model object '<em><b>Finding Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getImplementationStatus <em>Implementation Status</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getTargetId <em>Target Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingTargetImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingTargetImpl extends MinimalEObjectImpl.Container implements FindingTarget {
	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected MarkupLineDatatype title;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected MarkupMultilineDatatype description;

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
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected FindingTargetStatus status;

	/**
	 * The cached value of the '{@link #getImplementationStatus() <em>Implementation Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatus()
	 * @generated
	 * @ordered
	 */
	protected ImplementationStatus implementationStatus;

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
	 * The default value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetId() <em>Target Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetId()
	 * @generated
	 * @ordered
	 */
	protected String targetId = TARGET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FindingTargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getFindingTarget();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupLineDatatype getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(MarkupLineDatatype newTitle, NotificationChain msgs) {
		MarkupLineDatatype oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__TITLE, oldTitle, newTitle);
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
	public void setTitle(MarkupLineDatatype newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MarkupMultilineDatatype getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(MarkupMultilineDatatype newDescription, NotificationChain msgs) {
		MarkupMultilineDatatype oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__DESCRIPTION, oldDescription, newDescription);
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
	public void setDescription(MarkupMultilineDatatype newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.FINDING_TARGET__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.FINDING_TARGET__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingTargetStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatus(FindingTargetStatus newStatus, NotificationChain msgs) {
		FindingTargetStatus oldStatus = status;
		status = newStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__STATUS, oldStatus, newStatus);
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
	public void setStatus(FindingTargetStatus newStatus) {
		if (newStatus != status) {
			NotificationChain msgs = null;
			if (status != null)
				msgs = ((InternalEObject)status).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__STATUS, null, msgs);
			if (newStatus != null)
				msgs = ((InternalEObject)newStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__STATUS, null, msgs);
			msgs = basicSetStatus(newStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__STATUS, newStatus, newStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImplementationStatus getImplementationStatus() {
		return implementationStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImplementationStatus(ImplementationStatus newImplementationStatus, NotificationChain msgs) {
		ImplementationStatus oldImplementationStatus = implementationStatus;
		implementationStatus = newImplementationStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS, oldImplementationStatus, newImplementationStatus);
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
	public void setImplementationStatus(ImplementationStatus newImplementationStatus) {
		if (newImplementationStatus != implementationStatus) {
			NotificationChain msgs = null;
			if (implementationStatus != null)
				msgs = ((InternalEObject)implementationStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS, null, msgs);
			if (newImplementationStatus != null)
				msgs = ((InternalEObject)newImplementationStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS, null, msgs);
			msgs = basicSetImplementationStatus(newImplementationStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS, newImplementationStatus, newImplementationStatus));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING_TARGET__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTargetId() {
		return targetId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetId(String newTargetId) {
		String oldTargetId = targetId;
		targetId = newTargetId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__TARGET_ID, oldTargetId, targetId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING_TARGET__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.FINDING_TARGET__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.FINDING_TARGET__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.FINDING_TARGET__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.FINDING_TARGET__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.FINDING_TARGET__STATUS:
				return basicSetStatus(null, msgs);
			case OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS:
				return basicSetImplementationStatus(null, msgs);
			case OSCALPackage.FINDING_TARGET__REMARKS:
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
			case OSCALPackage.FINDING_TARGET__TITLE:
				return getTitle();
			case OSCALPackage.FINDING_TARGET__DESCRIPTION:
				return getDescription();
			case OSCALPackage.FINDING_TARGET__PROP:
				return getProp();
			case OSCALPackage.FINDING_TARGET__LINK:
				return getLink();
			case OSCALPackage.FINDING_TARGET__STATUS:
				return getStatus();
			case OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS:
				return getImplementationStatus();
			case OSCALPackage.FINDING_TARGET__REMARKS:
				return getRemarks();
			case OSCALPackage.FINDING_TARGET__TARGET_ID:
				return getTargetId();
			case OSCALPackage.FINDING_TARGET__TYPE:
				return getType();
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
			case OSCALPackage.FINDING_TARGET__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__STATUS:
				setStatus((FindingTargetStatus)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS:
				setImplementationStatus((ImplementationStatus)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__TARGET_ID:
				setTargetId((String)newValue);
				return;
			case OSCALPackage.FINDING_TARGET__TYPE:
				setType((String)newValue);
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
			case OSCALPackage.FINDING_TARGET__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.FINDING_TARGET__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.FINDING_TARGET__PROP:
				getProp().clear();
				return;
			case OSCALPackage.FINDING_TARGET__LINK:
				getLink().clear();
				return;
			case OSCALPackage.FINDING_TARGET__STATUS:
				setStatus((FindingTargetStatus)null);
				return;
			case OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS:
				setImplementationStatus((ImplementationStatus)null);
				return;
			case OSCALPackage.FINDING_TARGET__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.FINDING_TARGET__TARGET_ID:
				setTargetId(TARGET_ID_EDEFAULT);
				return;
			case OSCALPackage.FINDING_TARGET__TYPE:
				setType(TYPE_EDEFAULT);
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
			case OSCALPackage.FINDING_TARGET__TITLE:
				return title != null;
			case OSCALPackage.FINDING_TARGET__DESCRIPTION:
				return description != null;
			case OSCALPackage.FINDING_TARGET__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.FINDING_TARGET__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.FINDING_TARGET__STATUS:
				return status != null;
			case OSCALPackage.FINDING_TARGET__IMPLEMENTATION_STATUS:
				return implementationStatus != null;
			case OSCALPackage.FINDING_TARGET__REMARKS:
				return remarks != null;
			case OSCALPackage.FINDING_TARGET__TARGET_ID:
				return TARGET_ID_EDEFAULT == null ? targetId != null : !TARGET_ID_EDEFAULT.equals(targetId);
			case OSCALPackage.FINDING_TARGET__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (targetId: ");
		result.append(targetId);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //FindingTargetImpl
