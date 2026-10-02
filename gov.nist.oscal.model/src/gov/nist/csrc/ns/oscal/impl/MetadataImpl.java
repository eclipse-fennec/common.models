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

import gov.nist.csrc.ns.oscal.Action;
import gov.nist.csrc.ns.oscal.DocumentId;
import gov.nist.csrc.ns.oscal.Link;
import gov.nist.csrc.ns.oscal.Location;
import gov.nist.csrc.ns.oscal.MarkupLineDatatype;
import gov.nist.csrc.ns.oscal.MarkupMultilineDatatype;
import gov.nist.csrc.ns.oscal.Metadata;
import gov.nist.csrc.ns.oscal.OSCALPackage;
import gov.nist.csrc.ns.oscal.Party;
import gov.nist.csrc.ns.oscal.Property;
import gov.nist.csrc.ns.oscal.ResponsibleParty;
import gov.nist.csrc.ns.oscal.Revisions;
import gov.nist.csrc.ns.oscal.Role;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

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
 * An implementation of the model object '<em><b>Metadata</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getPublished <em>Published</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getLastModified <em>Last Modified</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getOscalVersion <em>Oscal Version</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getDocumentId <em>Document Id</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getProp <em>Prop</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getLink <em>Link</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getRole <em>Role</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getParty <em>Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getResponsibleParty <em>Responsible Party</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getAction <em>Action</em>}</li>
 *   <li>{@link gov.nist.csrc.ns.oscal.impl.MetadataImpl#getRemarks <em>Remarks</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataImpl extends MinimalEObjectImpl.Container implements Metadata {
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
	 * The default value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar PUBLISHED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublished() <em>Published</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublished()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar published = PUBLISHED_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LAST_MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastModified() <em>Last Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastModified()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lastModified = LAST_MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOscalVersion() <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OSCAL_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOscalVersion() <em>Oscal Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOscalVersion()
	 * @generated
	 * @ordered
	 */
	protected String oscalVersion = OSCAL_VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRevisions() <em>Revisions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevisions()
	 * @generated
	 * @ordered
	 */
	protected Revisions revisions;

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
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<Role> role;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getParty() <em>Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParty()
	 * @generated
	 * @ordered
	 */
	protected EList<Party> party;

	/**
	 * The cached value of the '{@link #getResponsibleParty() <em>Responsible Party</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsibleParty()
	 * @generated
	 * @ordered
	 */
	protected EList<ResponsibleParty> responsibleParty;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> action;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OSCALPackage.eINSTANCE.getMetadata();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.METADATA__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.METADATA__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getPublished() {
		return published;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPublished(XMLGregorianCalendar newPublished) {
		XMLGregorianCalendar oldPublished = published;
		published = newPublished;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__PUBLISHED, oldPublished, published));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public XMLGregorianCalendar getLastModified() {
		return lastModified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLastModified(XMLGregorianCalendar newLastModified) {
		XMLGregorianCalendar oldLastModified = lastModified;
		lastModified = newLastModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__LAST_MODIFIED, oldLastModified, lastModified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOscalVersion() {
		return oscalVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOscalVersion(String newOscalVersion) {
		String oldOscalVersion = oscalVersion;
		oscalVersion = newOscalVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__OSCAL_VERSION, oldOscalVersion, oscalVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Revisions getRevisions() {
		return revisions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevisions(Revisions newRevisions, NotificationChain msgs) {
		Revisions oldRevisions = revisions;
		revisions = newRevisions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__REVISIONS, oldRevisions, newRevisions);
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
	public void setRevisions(Revisions newRevisions) {
		if (newRevisions != revisions) {
			NotificationChain msgs = null;
			if (revisions != null)
				msgs = ((InternalEObject)revisions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.METADATA__REVISIONS, null, msgs);
			if (newRevisions != null)
				msgs = ((InternalEObject)newRevisions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.METADATA__REVISIONS, null, msgs);
			msgs = basicSetRevisions(newRevisions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__REVISIONS, newRevisions, newRevisions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DocumentId> getDocumentId() {
		if (documentId == null) {
			documentId = new EObjectContainmentEList<DocumentId>(DocumentId.class, this, OSCALPackage.METADATA__DOCUMENT_ID);
		}
		return documentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Property> getProp() {
		if (prop == null) {
			prop = new EObjectContainmentEList<Property>(Property.class, this, OSCALPackage.METADATA__PROP);
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
			link = new EObjectContainmentEList<Link>(Link.class, this, OSCALPackage.METADATA__LINK);
		}
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Role> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<Role>(Role.class, this, OSCALPackage.METADATA__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this, OSCALPackage.METADATA__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Party> getParty() {
		if (party == null) {
			party = new EObjectContainmentEList<Party>(Party.class, this, OSCALPackage.METADATA__PARTY);
		}
		return party;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ResponsibleParty> getResponsibleParty() {
		if (responsibleParty == null) {
			responsibleParty = new EObjectContainmentEList<ResponsibleParty>(ResponsibleParty.class, this, OSCALPackage.METADATA__RESPONSIBLE_PARTY);
		}
		return responsibleParty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, OSCALPackage.METADATA__ACTION);
		}
		return action;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__REMARKS, oldRemarks, newRemarks);
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
				msgs = ((InternalEObject)remarks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.METADATA__REMARKS, null, msgs);
			if (newRemarks != null)
				msgs = ((InternalEObject)newRemarks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OSCALPackage.METADATA__REMARKS, null, msgs);
			msgs = basicSetRemarks(newRemarks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OSCALPackage.METADATA__REMARKS, newRemarks, newRemarks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OSCALPackage.METADATA__TITLE:
				return basicSetTitle(null, msgs);
			case OSCALPackage.METADATA__REVISIONS:
				return basicSetRevisions(null, msgs);
			case OSCALPackage.METADATA__DOCUMENT_ID:
				return ((InternalEList<?>)getDocumentId()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__PROP:
				return ((InternalEList<?>)getProp()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__LINK:
				return ((InternalEList<?>)getLink()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__LOCATION:
				return ((InternalEList<?>)getLocation()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__PARTY:
				return ((InternalEList<?>)getParty()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__RESPONSIBLE_PARTY:
				return ((InternalEList<?>)getResponsibleParty()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case OSCALPackage.METADATA__REMARKS:
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
			case OSCALPackage.METADATA__TITLE:
				return getTitle();
			case OSCALPackage.METADATA__PUBLISHED:
				return getPublished();
			case OSCALPackage.METADATA__LAST_MODIFIED:
				return getLastModified();
			case OSCALPackage.METADATA__VERSION:
				return getVersion();
			case OSCALPackage.METADATA__OSCAL_VERSION:
				return getOscalVersion();
			case OSCALPackage.METADATA__REVISIONS:
				return getRevisions();
			case OSCALPackage.METADATA__DOCUMENT_ID:
				return getDocumentId();
			case OSCALPackage.METADATA__PROP:
				return getProp();
			case OSCALPackage.METADATA__LINK:
				return getLink();
			case OSCALPackage.METADATA__ROLE:
				return getRole();
			case OSCALPackage.METADATA__LOCATION:
				return getLocation();
			case OSCALPackage.METADATA__PARTY:
				return getParty();
			case OSCALPackage.METADATA__RESPONSIBLE_PARTY:
				return getResponsibleParty();
			case OSCALPackage.METADATA__ACTION:
				return getAction();
			case OSCALPackage.METADATA__REMARKS:
				return getRemarks();
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
			case OSCALPackage.METADATA__TITLE:
				setTitle((MarkupLineDatatype)newValue);
				return;
			case OSCALPackage.METADATA__PUBLISHED:
				setPublished((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.METADATA__LAST_MODIFIED:
				setLastModified((XMLGregorianCalendar)newValue);
				return;
			case OSCALPackage.METADATA__VERSION:
				setVersion((String)newValue);
				return;
			case OSCALPackage.METADATA__OSCAL_VERSION:
				setOscalVersion((String)newValue);
				return;
			case OSCALPackage.METADATA__REVISIONS:
				setRevisions((Revisions)newValue);
				return;
			case OSCALPackage.METADATA__DOCUMENT_ID:
				getDocumentId().clear();
				getDocumentId().addAll((Collection<? extends DocumentId>)newValue);
				return;
			case OSCALPackage.METADATA__PROP:
				getProp().clear();
				getProp().addAll((Collection<? extends Property>)newValue);
				return;
			case OSCALPackage.METADATA__LINK:
				getLink().clear();
				getLink().addAll((Collection<? extends Link>)newValue);
				return;
			case OSCALPackage.METADATA__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends Role>)newValue);
				return;
			case OSCALPackage.METADATA__LOCATION:
				getLocation().clear();
				getLocation().addAll((Collection<? extends Location>)newValue);
				return;
			case OSCALPackage.METADATA__PARTY:
				getParty().clear();
				getParty().addAll((Collection<? extends Party>)newValue);
				return;
			case OSCALPackage.METADATA__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				getResponsibleParty().addAll((Collection<? extends ResponsibleParty>)newValue);
				return;
			case OSCALPackage.METADATA__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case OSCALPackage.METADATA__REMARKS:
				setRemarks((MarkupMultilineDatatype)newValue);
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
			case OSCALPackage.METADATA__TITLE:
				setTitle((MarkupLineDatatype)null);
				return;
			case OSCALPackage.METADATA__PUBLISHED:
				setPublished(PUBLISHED_EDEFAULT);
				return;
			case OSCALPackage.METADATA__LAST_MODIFIED:
				setLastModified(LAST_MODIFIED_EDEFAULT);
				return;
			case OSCALPackage.METADATA__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case OSCALPackage.METADATA__OSCAL_VERSION:
				setOscalVersion(OSCAL_VERSION_EDEFAULT);
				return;
			case OSCALPackage.METADATA__REVISIONS:
				setRevisions((Revisions)null);
				return;
			case OSCALPackage.METADATA__DOCUMENT_ID:
				getDocumentId().clear();
				return;
			case OSCALPackage.METADATA__PROP:
				getProp().clear();
				return;
			case OSCALPackage.METADATA__LINK:
				getLink().clear();
				return;
			case OSCALPackage.METADATA__ROLE:
				getRole().clear();
				return;
			case OSCALPackage.METADATA__LOCATION:
				getLocation().clear();
				return;
			case OSCALPackage.METADATA__PARTY:
				getParty().clear();
				return;
			case OSCALPackage.METADATA__RESPONSIBLE_PARTY:
				getResponsibleParty().clear();
				return;
			case OSCALPackage.METADATA__ACTION:
				getAction().clear();
				return;
			case OSCALPackage.METADATA__REMARKS:
				setRemarks((MarkupMultilineDatatype)null);
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
			case OSCALPackage.METADATA__TITLE:
				return title != null;
			case OSCALPackage.METADATA__PUBLISHED:
				return PUBLISHED_EDEFAULT == null ? published != null : !PUBLISHED_EDEFAULT.equals(published);
			case OSCALPackage.METADATA__LAST_MODIFIED:
				return LAST_MODIFIED_EDEFAULT == null ? lastModified != null : !LAST_MODIFIED_EDEFAULT.equals(lastModified);
			case OSCALPackage.METADATA__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case OSCALPackage.METADATA__OSCAL_VERSION:
				return OSCAL_VERSION_EDEFAULT == null ? oscalVersion != null : !OSCAL_VERSION_EDEFAULT.equals(oscalVersion);
			case OSCALPackage.METADATA__REVISIONS:
				return revisions != null;
			case OSCALPackage.METADATA__DOCUMENT_ID:
				return documentId != null && !documentId.isEmpty();
			case OSCALPackage.METADATA__PROP:
				return prop != null && !prop.isEmpty();
			case OSCALPackage.METADATA__LINK:
				return link != null && !link.isEmpty();
			case OSCALPackage.METADATA__ROLE:
				return role != null && !role.isEmpty();
			case OSCALPackage.METADATA__LOCATION:
				return location != null && !location.isEmpty();
			case OSCALPackage.METADATA__PARTY:
				return party != null && !party.isEmpty();
			case OSCALPackage.METADATA__RESPONSIBLE_PARTY:
				return responsibleParty != null && !responsibleParty.isEmpty();
			case OSCALPackage.METADATA__ACTION:
				return action != null && !action.isEmpty();
			case OSCALPackage.METADATA__REMARKS:
				return remarks != null;
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
		result.append(" (published: ");
		result.append(published);
		result.append(", lastModified: ");
		result.append(lastModified);
		result.append(", version: ");
		result.append(version);
		result.append(", oscalVersion: ");
		result.append(oscalVersion);
		result.append(')');
		return result.toString();
	}

} //MetadataImpl
