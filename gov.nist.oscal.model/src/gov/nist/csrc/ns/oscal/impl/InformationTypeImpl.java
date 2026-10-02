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

import gov.nist.csrc.ns.oscal.Categorization;
import gov.nist.csrc.ns.oscal.Impact;
import gov.nist.csrc.ns.oscal.InformationType;
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
 * An implementation of the model object '<em><b>Information Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getCategorization <em>Categorization</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getConfidentialityImpact <em>Confidentiality Impact</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getIntegrityImpact <em>Integrity Impact</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getAvailabilityImpact <em>Availability Impact</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.InformationTypeImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InformationTypeImpl extends MinimalEObjectImpl.Container implements InformationType {
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
	 * The cached value of the '{@link #getCategorization() <em>Categorization</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorization()
	 * @generated
	 * @ordered
	 */
	protected EList<Categorization> categorization;

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
	 * The cached value of the '{@link #getConfidentialityImpact() <em>Confidentiality Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfidentialityImpact()
	 * @generated
	 * @ordered
	 */
	protected Impact confidentialityImpact;

	/**
	 * The cached value of the '{@link #getIntegrityImpact() <em>Integrity Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntegrityImpact()
	 * @generated
	 * @ordered
	 */
	protected Impact integrityImpact;

	/**
	 * The cached value of the '{@link #getAvailabilityImpact() <em>Availability Impact</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityImpact()
	 * @generated
	 * @ordered
	 */
	protected Impact availabilityImpact;

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
	protected InformationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getInformationType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__TITLE, newTitle, newTitle));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__DESCRIPTION, oldDescription, newDescription);
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
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Categorization> getCategorization() {
		if (categorization == null) {
			categorization = new EObjectContainmentEList<Categorization>(Categorization.class, this, OSCALPackage.INFORMATION_TYPE__CATEGORIZATION);
		}
		return categorization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.INFORMATION_TYPE__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.INFORMATION_TYPE__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Impact getConfidentialityImpact() {
		return confidentialityImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfidentialityImpact(Impact newConfidentialityImpact, NotificationChain msgs) {
		Impact oldConfidentialityImpact = confidentialityImpact;
		confidentialityImpact = newConfidentialityImpact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT, oldConfidentialityImpact, newConfidentialityImpact);
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
	public void setConfidentialityImpact(Impact newConfidentialityImpact) {
		if (newConfidentialityImpact != confidentialityImpact) {
			NotificationChain msgs = null;
			if (confidentialityImpact != null)
				msgs = ((InternalEObject)confidentialityImpact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT, null, msgs);
			if (newConfidentialityImpact != null)
				msgs = ((InternalEObject)newConfidentialityImpact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT, null, msgs);
			msgs = basicSetConfidentialityImpact(newConfidentialityImpact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT, newConfidentialityImpact, newConfidentialityImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Impact getIntegrityImpact() {
		return integrityImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIntegrityImpact(Impact newIntegrityImpact, NotificationChain msgs) {
		Impact oldIntegrityImpact = integrityImpact;
		integrityImpact = newIntegrityImpact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT, oldIntegrityImpact, newIntegrityImpact);
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
	public void setIntegrityImpact(Impact newIntegrityImpact) {
		if (newIntegrityImpact != integrityImpact) {
			NotificationChain msgs = null;
			if (integrityImpact != null)
				msgs = ((InternalEObject)integrityImpact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT, null, msgs);
			if (newIntegrityImpact != null)
				msgs = ((InternalEObject)newIntegrityImpact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT, null, msgs);
			msgs = basicSetIntegrityImpact(newIntegrityImpact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT, newIntegrityImpact, newIntegrityImpact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Impact getAvailabilityImpact() {
		return availabilityImpact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAvailabilityImpact(Impact newAvailabilityImpact, NotificationChain msgs) {
		Impact oldAvailabilityImpact = availabilityImpact;
		availabilityImpact = newAvailabilityImpact;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT, oldAvailabilityImpact, newAvailabilityImpact);
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
	public void setAvailabilityImpact(Impact newAvailabilityImpact) {
		if (newAvailabilityImpact != availabilityImpact) {
			NotificationChain msgs = null;
			if (availabilityImpact != null)
				msgs = ((InternalEObject)availabilityImpact).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT, null, msgs);
			if (newAvailabilityImpact != null)
				msgs = ((InternalEObject)newAvailabilityImpact).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT, null, msgs);
			msgs = basicSetAvailabilityImpact(newAvailabilityImpact, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT, newAvailabilityImpact, newAvailabilityImpact));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.INFORMATION_TYPE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.INFORMATION_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.INFORMATION_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case OSCALPackage.INFORMATION_TYPE__CATEGORIZATION:
				return ((InternalEList<?>)getCategorization()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INFORMATION_TYPE__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INFORMATION_TYPE__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT:
				return basicSetConfidentialityImpact(null, msgs);
			case OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT:
				return basicSetIntegrityImpact(null, msgs);
			case OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT:
				return basicSetAvailabilityImpact(null, msgs);
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
			case OSCALPackage.INFORMATION_TYPE__TITLE:
				return getTitle();
			case OSCALPackage.INFORMATION_TYPE__DESCRIPTION:
				return getDescription();
			case OSCALPackage.INFORMATION_TYPE__CATEGORIZATION:
				return getCategorization();
			case OSCALPackage.INFORMATION_TYPE__PROP:
				return getProp();
			case OSCALPackage.INFORMATION_TYPE__LINK:
				return getLink();
			case OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT:
				return getConfidentialityImpact();
			case OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT:
				return getIntegrityImpact();
			case OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT:
				return getAvailabilityImpact();
			case OSCALPackage.INFORMATION_TYPE__UUID:
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
			case OSCALPackage.INFORMATION_TYPE__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__CATEGORIZATION:
				getCategorization().clear();
				getCategorization().addAll((Collection<? extends Categorization>)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT:
				setConfidentialityImpact((Impact)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT:
				setIntegrityImpact((Impact)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT:
				setAvailabilityImpact((Impact)newValue);
				return;
			case OSCALPackage.INFORMATION_TYPE__UUID:
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
			case OSCALPackage.INFORMATION_TYPE__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.INFORMATION_TYPE__DESCRIPTION:
				setDescription((MarkupMultilineDatatype)null);
				return;
			case OSCALPackage.INFORMATION_TYPE__CATEGORIZATION:
				getCategorization().clear();
				return;
			case OSCALPackage.INFORMATION_TYPE__PROP:
				getProp().clear();
				return;
			case OSCALPackage.INFORMATION_TYPE__LINK:
				getLink().clear();
				return;
			case OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT:
				setConfidentialityImpact((Impact)null);
				return;
			case OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT:
				setIntegrityImpact((Impact)null);
				return;
			case OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT:
				setAvailabilityImpact((Impact)null);
				return;
			case OSCALPackage.INFORMATION_TYPE__UUID:
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
			case OSCALPackage.INFORMATION_TYPE__TITLE:
				return title != null;
			case OSCALPackage.INFORMATION_TYPE__DESCRIPTION:
				return description != null;
			case OSCALPackage.INFORMATION_TYPE__CATEGORIZATION:
				return categorization != null && !categorization.isEmpty();
			case OSCALPackage.INFORMATION_TYPE__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.INFORMATION_TYPE__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.INFORMATION_TYPE__CONFIDENTIALITY_IMPACT:
				return confidentialityImpact != null;
			case OSCALPackage.INFORMATION_TYPE__INTEGRITY_IMPACT:
				return integrityImpact != null;
			case OSCALPackage.INFORMATION_TYPE__AVAILABILITY_IMPACT:
				return availabilityImpact != null;
			case OSCALPackage.INFORMATION_TYPE__UUID:
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

} //InformationTypeImpl
