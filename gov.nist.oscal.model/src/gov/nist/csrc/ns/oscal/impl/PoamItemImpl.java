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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected static final String REMARKS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemarks() <em>Remarks</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemarks()
	 * @generated
	 * @ordered
	 */
	protected String remarks = REMARKS_EDEFAULT;

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
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__DESCRIPTION, oldDescription, description));
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
	public String getRemarks() {
		return remarks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRemarks(String newRemarks) {
		String oldRemarks = remarks;
		remarks = newRemarks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.POAM_ITEM__REMARKS, oldRemarks, remarks));
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
				setTitle((String)newValue);
				return;
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				setDescription((String)newValue);
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
				setRemarks((String)newValue);
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
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
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
				setRemarks(REMARKS_EDEFAULT);
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
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.POAM_ITEM__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
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
		result.append(" (title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //PoamItemImpl
