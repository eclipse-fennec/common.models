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

import gov.nist.csrc.ns.oscal.AssociatedRisk;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.PoamItem;
import gov.nist.csrc.ns.oscal.PoamItemOrigin;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.RelatedFinding;
import gov.nist.csrc.ns.oscal.RelatedObservation;

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
 * An implementation of the model object '<em><b>Poam Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getRelatedFinding <em>Related Finding</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getRelatedObservation <em>Related Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getAssociatedRisk <em>Associated Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.PoamItemImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PoamItemImpl extends MinimalEObjectImpl.Container implements PoamItem {
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
	 * The cached value of the '{@link #getOrigin() <em>Origin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrigin()
	 * @generated
	 * @ordered
	 */
	protected EList<PoamItemOrigin> origin;

	/**
	 * The cached value of the '{@link #getRelatedFinding() <em>Related Finding</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFinding()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedFinding> relatedFinding;

	/**
	 * The cached value of the '{@link #getRelatedObservation() <em>Related Observation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedObservation()
	 * @generated
	 * @ordered
	 */
	protected EList<RelatedObservation> relatedObservation;

	/**
	 * The cached value of the '{@link #getAssociatedRisk() <em>Associated Risk</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedRisk()
	 * @generated
	 * @ordered
	 */
	protected EList<AssociatedRisk> associatedRisk;

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
	protected PoamItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getPoamItem();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_ITEM__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_ITEM__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_ITEM__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_ITEM__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.POAM_ITEM__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.POAM_ITEM__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PoamItemOrigin> getOrigin() {
		if (origin == null) {
			origin = new EObjectContainmentEList<PoamItemOrigin>(PoamItemOrigin.class, this, OSCALPackage.POAM_ITEM__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedFinding> getRelatedFinding() {
		if (relatedFinding == null) {
			relatedFinding = new EObjectContainmentEList<RelatedFinding>(RelatedFinding.class, this, OSCALPackage.POAM_ITEM__RELATED_FINDING);
		}
		return relatedFinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObservation> getRelatedObservation() {
		if (relatedObservation == null) {
			relatedObservation = new EObjectContainmentEList<RelatedObservation>(RelatedObservation.class, this, OSCALPackage.POAM_ITEM__RELATED_OBSERVATION);
		}
		return relatedObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociatedRisk> getAssociatedRisk() {
		if (associatedRisk == null) {
			associatedRisk = new EObjectContainmentEList<AssociatedRisk>(AssociatedRisk.class, this, OSCALPackage.POAM_ITEM__ASSOCIATED_RISK);
		}
		return associatedRisk;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_ITEM__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.POAM_ITEM__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__REMARKS, newRemarks, newRemarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.POAM_ITEM__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.POAM_ITEM__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_ITEM__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_ITEM__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_ITEM__RELATED_FINDING:
				return ((InternalEList<?>)getRelatedFinding()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_ITEM__RELATED_OBSERVATION:
				return ((InternalEList<?>)getRelatedObservation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_ITEM__ASSOCIATED_RISK:
				return ((InternalEList<?>)getAssociatedRisk()).basicRemove(otherEnd, msgs);
			case OSCALPackage.POAM_ITEM__REMARKS:
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
			case OSCALPackage.POAM_ITEM__TITLE:
				return getTitle();
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				return getDescription();
			case OSCALPackage.POAM_ITEM__PROP:
				return getProp();
			case OSCALPackage.POAM_ITEM__LINK:
				return getLink();
			case OSCALPackage.POAM_ITEM__ORIGIN:
				return getOrigin();
			case OSCALPackage.POAM_ITEM__RELATED_FINDING:
				return getRelatedFinding();
			case OSCALPackage.POAM_ITEM__RELATED_OBSERVATION:
				return getRelatedObservation();
			case OSCALPackage.POAM_ITEM__ASSOCIATED_RISK:
				return getAssociatedRisk();
			case OSCALPackage.POAM_ITEM__REMARKS:
				return getRemarks();
			case OSCALPackage.POAM_ITEM__UUID:
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
			case OSCALPackage.POAM_ITEM__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.POAM_ITEM__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.POAM_ITEM__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.POAM_ITEM__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends PoamItemOrigin>)newValue);
				return;
			case OSCALPackage.POAM_ITEM__RELATED_FINDING:
				getRelatedFinding().clear();
				getRelatedFinding().addAll((Collection<? extends RelatedFinding>)newValue);
				return;
			case OSCALPackage.POAM_ITEM__RELATED_OBSERVATION:
				getRelatedObservation().clear();
				getRelatedObservation().addAll((Collection<? extends RelatedObservation>)newValue);
				return;
			case OSCALPackage.POAM_ITEM__ASSOCIATED_RISK:
				getAssociatedRisk().clear();
				getAssociatedRisk().addAll((Collection<? extends AssociatedRisk>)newValue);
				return;
			case OSCALPackage.POAM_ITEM__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.POAM_ITEM__UUID:
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
			case OSCALPackage.POAM_ITEM__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.POAM_ITEM__PROP:
				getProp().clear();
				return;
			case OSCALPackage.POAM_ITEM__LINK:
				getLink().clear();
				return;
			case OSCALPackage.POAM_ITEM__ORIGIN:
				getOrigin().clear();
				return;
			case OSCALPackage.POAM_ITEM__RELATED_FINDING:
				getRelatedFinding().clear();
				return;
			case OSCALPackage.POAM_ITEM__RELATED_OBSERVATION:
				getRelatedObservation().clear();
				return;
			case OSCALPackage.POAM_ITEM__ASSOCIATED_RISK:
				getAssociatedRisk().clear();
				return;
			case OSCALPackage.POAM_ITEM__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.POAM_ITEM__UUID:
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
			case OSCALPackage.POAM_ITEM__TITLE:
				return title != null;
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				return description != null;
			case OSCALPackage.POAM_ITEM__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.POAM_ITEM__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.POAM_ITEM__ORIGIN:
				return origin != null && !origin.isEmpty();
			case OSCALPackage.POAM_ITEM__RELATED_FINDING:
				return relatedFinding != null && !relatedFinding.isEmpty();
			case OSCALPackage.POAM_ITEM__RELATED_OBSERVATION:
				return relatedObservation != null && !relatedObservation.isEmpty();
			case OSCALPackage.POAM_ITEM__ASSOCIATED_RISK:
				return associatedRisk != null && !associatedRisk.isEmpty();
			case OSCALPackage.POAM_ITEM__REMARKS:
				return remarks != null;
			case OSCALPackage.POAM_ITEM__UUID:
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

} //PoamItemImpl
