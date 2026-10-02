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
import gov.nist.csrc.ns.oscal.Finding;
import gov.nist.csrc.ns.oscal.FindingTarget;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Origin;
import gov.nist.csrc.ns.oscal.Property;
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
 * An implementation of the model object '<em><b>Finding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getOrigin <em>Origin</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getImplementationStatementUuid <em>Implementation Statement Uuid</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getRelatedObservation <em>Related Observation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getAssociatedRisk <em>Associated Risk</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.FindingImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FindingImpl extends MinimalEObjectImpl.Container implements Finding {
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
	protected EList<Origin> origin;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected FindingTarget target;

	/**
	 * The default value of the '{@link #getImplementationStatementUuid() <em>Implementation Statement Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatementUuid()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_STATEMENT_UUID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImplementationStatementUuid() <em>Implementation Statement Uuid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationStatementUuid()
	 * @generated
	 * @ordered
	 */
	protected String implementationStatementUuid = IMPLEMENTATION_STATEMENT_UUID_EDEFAULT;

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
	protected FindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getFinding();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.FINDING__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.FINDING__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Origin> getOrigin() {
		if (origin == null) {
			origin = new EObjectContainmentEList<Origin>(Origin.class, this, OSCALPackage.FINDING__ORIGIN);
		}
		return origin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FindingTarget getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(FindingTarget newTarget, NotificationChain msgs) {
		FindingTarget oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__TARGET, oldTarget, newTarget);
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
	public void setTarget(FindingTarget newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.FINDING__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImplementationStatementUuid() {
		return implementationStatementUuid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImplementationStatementUuid(String newImplementationStatementUuid) {
		String oldImplementationStatementUuid = implementationStatementUuid;
		implementationStatementUuid = newImplementationStatementUuid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__IMPLEMENTATION_STATEMENT_UUID, oldImplementationStatementUuid, implementationStatementUuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RelatedObservation> getRelatedObservation() {
		if (relatedObservation == null) {
			relatedObservation = new EObjectContainmentEList<RelatedObservation>(RelatedObservation.class, this, OSCALPackage.FINDING__RELATED_OBSERVATION);
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
			associatedRisk = new EObjectContainmentEList<AssociatedRisk>(AssociatedRisk.class, this, OSCALPackage.FINDING__ASSOCIATED_RISK);
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.FINDING__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.FINDING__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.FINDING__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.FINDING__ORIGIN:
				return ((InternalEList<?>)getOrigin()).basicRemove(otherEnd, msgs);
			case OSCALPackage.FINDING__TARGET:
				return basicSetTarget(null, msgs);
			case OSCALPackage.FINDING__RELATED_OBSERVATION:
				return ((InternalEList<?>)getRelatedObservation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.FINDING__ASSOCIATED_RISK:
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
			case OSCALPackage.FINDING__TITLE:
				return getTitle();
			case OSCALPackage.FINDING__DESCRIPTION:
				return getDescription();
			case OSCALPackage.FINDING__PROP:
				return getProp();
			case OSCALPackage.FINDING__LINK:
				return getLink();
			case OSCALPackage.FINDING__ORIGIN:
				return getOrigin();
			case OSCALPackage.FINDING__TARGET:
				return getTarget();
			case OSCALPackage.FINDING__IMPLEMENTATION_STATEMENT_UUID:
				return getImplementationStatementUuid();
			case OSCALPackage.FINDING__RELATED_OBSERVATION:
				return getRelatedObservation();
			case OSCALPackage.FINDING__ASSOCIATED_RISK:
				return getAssociatedRisk();
			case OSCALPackage.FINDING__REMARKS:
				return getRemarks();
			case OSCALPackage.FINDING__UUID:
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
			case OSCALPackage.FINDING__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.FINDING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.FINDING__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.FINDING__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.FINDING__ORIGIN:
				getOrigin().clear();
				getOrigin().addAll((Collection<? extends Origin>)newValue);
				return;
			case OSCALPackage.FINDING__TARGET:
				setTarget((FindingTarget)newValue);
				return;
			case OSCALPackage.FINDING__IMPLEMENTATION_STATEMENT_UUID:
				setImplementationStatementUuid((String)newValue);
				return;
			case OSCALPackage.FINDING__RELATED_OBSERVATION:
				getRelatedObservation().clear();
				getRelatedObservation().addAll((Collection<? extends RelatedObservation>)newValue);
				return;
			case OSCALPackage.FINDING__ASSOCIATED_RISK:
				getAssociatedRisk().clear();
				getAssociatedRisk().addAll((Collection<? extends AssociatedRisk>)newValue);
				return;
			case OSCALPackage.FINDING__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.FINDING__UUID:
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
			case OSCALPackage.FINDING__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.FINDING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.FINDING__PROP:
				getProp().clear();
				return;
			case OSCALPackage.FINDING__LINK:
				getLink().clear();
				return;
			case OSCALPackage.FINDING__ORIGIN:
				getOrigin().clear();
				return;
			case OSCALPackage.FINDING__TARGET:
				setTarget((FindingTarget)null);
				return;
			case OSCALPackage.FINDING__IMPLEMENTATION_STATEMENT_UUID:
				setImplementationStatementUuid(IMPLEMENTATION_STATEMENT_UUID_EDEFAULT);
				return;
			case OSCALPackage.FINDING__RELATED_OBSERVATION:
				getRelatedObservation().clear();
				return;
			case OSCALPackage.FINDING__ASSOCIATED_RISK:
				getAssociatedRisk().clear();
				return;
			case OSCALPackage.FINDING__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.FINDING__UUID:
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
			case OSCALPackage.FINDING__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.FINDING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.FINDING__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.FINDING__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.FINDING__ORIGIN:
				return origin != null && !origin.isEmpty();
			case OSCALPackage.FINDING__TARGET:
				return target != null;
			case OSCALPackage.FINDING__IMPLEMENTATION_STATEMENT_UUID:
				return IMPLEMENTATION_STATEMENT_UUID_EDEFAULT == null ? implementationStatementUuid != null : !IMPLEMENTATION_STATEMENT_UUID_EDEFAULT.equals(implementationStatementUuid);
			case OSCALPackage.FINDING__RELATED_OBSERVATION:
				return relatedObservation != null && !relatedObservation.isEmpty();
			case OSCALPackage.FINDING__ASSOCIATED_RISK:
				return associatedRisk != null && !associatedRisk.isEmpty();
			case OSCALPackage.FINDING__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.FINDING__UUID:
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
		result.append(", implementationStatementUuid: ");
		result.append(implementationStatementUuid);
		result.append(", remarks: ");
		result.append(remarks);
		result.append(", uuid: ");
		result.append(uuid);
		result.append(')');
		return result.toString();
	}

} //FindingImpl
