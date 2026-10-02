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

import gov.nist.csrc.ns.oscal.BackMatterResource;
import gov.nist.csrc.ns.oscal.Base64;
import gov.nist.csrc.ns.oscal.Citation;
import gov.nist.csrc.ns.oscal.DocumentId;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.Rlink;

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
 * An implementation of the model object '<em><b>Back Matter Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getCitation <em>Citation</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getRlink <em>Rlink</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getBase64 <em>Base64</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getRemarks <em>Remarks</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.BackMatterResourceImpl#getUuid <em>Uuid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BackMatterResourceImpl extends MinimalEObjectImpl.Container implements BackMatterResource {
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
	 * The cached value of the '{@link #getDocumentId() <em>Document Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentId()
	 * @generated
	 * @ordered
	 */
	protected EList<DocumentId> documentId;

	/**
	 * The cached value of the '{@link #getCitation() <em>Citation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitation()
	 * @generated
	 * @ordered
	 */
	protected Citation citation;

	/**
	 * The cached value of the '{@link #getRlink() <em>Rlink</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRlink()
	 * @generated
	 * @ordered
	 */
	protected EList<Rlink> rlink;

	/**
	 * The cached value of the '{@link #getBase64() <em>Base64</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase64()
	 * @generated
	 * @ordered
	 */
	protected Base64 base64;

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
	protected BackMatterResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getBackMatterResource();
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.BACK_MATTER_RESOURCE__PROP);
		}
		return prop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentId> getDocumentId() {
		if (documentId == null) {
			documentId = new EObjectContainmentEList<DocumentId>(DocumentId.class, this, OSCALPackage.BACK_MATTER_RESOURCE__DOCUMENT_ID);
		}
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Citation getCitation() {
		return citation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitation(Citation newCitation, NotificationChain msgs) {
		Citation oldCitation = citation;
		citation = newCitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__CITATION, oldCitation, newCitation);
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
	public void setCitation(Citation newCitation) {
		if (newCitation != citation) {
			NotificationChain msgs = null;
			if (citation != null)
				msgs = ((InternalEObject)citation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BACK_MATTER_RESOURCE__CITATION, null, msgs);
			if (newCitation != null)
				msgs = ((InternalEObject)newCitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BACK_MATTER_RESOURCE__CITATION, null, msgs);
			msgs = basicSetCitation(newCitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__CITATION, newCitation, newCitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Rlink> getRlink() {
		if (rlink == null) {
			rlink = new EObjectContainmentEList<Rlink>(Rlink.class, this, OSCALPackage.BACK_MATTER_RESOURCE__RLINK);
		}
		return rlink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Base64 getBase64() {
		return base64;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBase64(Base64 newBase64, NotificationChain msgs) {
		Base64 oldBase64 = base64;
		base64 = newBase64;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__BASE64, oldBase64, newBase64);
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
	public void setBase64(Base64 newBase64) {
		if (newBase64 != base64) {
			NotificationChain msgs = null;
			if (base64 != null)
				msgs = ((InternalEObject)base64).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BACK_MATTER_RESOURCE__BASE64, null, msgs);
			if (newBase64 != null)
				msgs = ((InternalEObject)newBase64).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.BACK_MATTER_RESOURCE__BASE64, null, msgs);
			msgs = basicSetBase64(newBase64, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__BASE64, newBase64, newBase64));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__REMARKS, oldRemarks, remarks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.BACK_MATTER_RESOURCE__UUID, oldUuid, uuid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.BACK_MATTER_RESOURCE__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BACK_MATTER_RESOURCE__DOCUMENT_ID:
				return ((InternalEList<?>)getDocumentId()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BACK_MATTER_RESOURCE__CITATION:
				return basicSetCitation(null, msgs);
			case OSCALPackage.BACK_MATTER_RESOURCE__RLINK:
				return ((InternalEList<?>)getRlink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.BACK_MATTER_RESOURCE__BASE64:
				return basicSetBase64(null, msgs);
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
			case OSCALPackage.BACK_MATTER_RESOURCE__TITLE:
				return getTitle();
			case OSCALPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				return getDescription();
			case OSCALPackage.BACK_MATTER_RESOURCE__PROP:
				return getProp();
			case OSCALPackage.BACK_MATTER_RESOURCE__DOCUMENT_ID:
				return getDocumentId();
			case OSCALPackage.BACK_MATTER_RESOURCE__CITATION:
				return getCitation();
			case OSCALPackage.BACK_MATTER_RESOURCE__RLINK:
				return getRlink();
			case OSCALPackage.BACK_MATTER_RESOURCE__BASE64:
				return getBase64();
			case OSCALPackage.BACK_MATTER_RESOURCE__REMARKS:
				return getRemarks();
			case OSCALPackage.BACK_MATTER_RESOURCE__UUID:
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
			case OSCALPackage.BACK_MATTER_RESOURCE__TITLE:
				setTitle((String)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__DOCUMENT_ID:
				getDocumentId().clear();
				getDocumentId().addAll((Collection<? extends DocumentId>)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__CITATION:
				setCitation((Citation)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__RLINK:
				getRlink().clear();
				getRlink().addAll((Collection<? extends Rlink>)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__BASE64:
				setBase64((Base64)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__REMARKS:
				setRemarks((String)newValue);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__UUID:
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
			case OSCALPackage.BACK_MATTER_RESOURCE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__PROP:
				getProp().clear();
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__DOCUMENT_ID:
				getDocumentId().clear();
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__CITATION:
				setCitation((Citation)null);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__RLINK:
				getRlink().clear();
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__BASE64:
				setBase64((Base64)null);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__REMARKS:
				setRemarks(REMARKS_EDEFAULT);
				return;
			case OSCALPackage.BACK_MATTER_RESOURCE__UUID:
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
			case OSCALPackage.BACK_MATTER_RESOURCE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OSCALPackage.BACK_MATTER_RESOURCE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case OSCALPackage.BACK_MATTER_RESOURCE__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.BACK_MATTER_RESOURCE__DOCUMENT_ID:
				return documentId != null && !documentId.isEmpty();
			case OSCALPackage.BACK_MATTER_RESOURCE__CITATION:
				return citation != null;
			case OSCALPackage.BACK_MATTER_RESOURCE__RLINK:
				return rlink != null && !rlink.isEmpty();
			case OSCALPackage.BACK_MATTER_RESOURCE__BASE64:
				return base64 != null;
			case OSCALPackage.BACK_MATTER_RESOURCE__REMARKS:
				return REMARKS_EDEFAULT == null ? remarks != null : !REMARKS_EDEFAULT.equals(remarks);
			case OSCALPackage.BACK_MATTER_RESOURCE__UUID:
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

} //BackMatterResourceImpl
